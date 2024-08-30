package com.mhcc.task.interceptor;

import io.grpc.*;
import org.apache.coyote.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalExceptionInterceptor implements ServerInterceptor {

    private static final Logger LOG =  LoggerFactory.getLogger(GlobalExceptionInterceptor.class);

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {

        ServerCall<ReqT, RespT> wrappedCall = new ForwardingServerCall.SimpleForwardingServerCall(call) {
            @Override
            public void close(Status status, Metadata trailers) {
                if (status.getCode() != Status.Code.OK) {
                    LOG.error("gRPC call failed: {}", status.getDescription());
                }
                super.close(status, trailers);
            }
        };

        return new ForwardingServerCallListener.SimpleForwardingServerCallListener(next.startCall(wrappedCall, headers)) {
            @Override
            public void onHalfClose() {
                try {
                    super.onHalfClose();
                } catch (Exception e) {
                    LOG.error("Exception caught in gRPC call", e);
                    Status status = mapExceptionToStatus(e);
                    wrappedCall.close(status, new Metadata());
                }
            }
        };
    }

    private Status mapExceptionToStatus(Exception e) {
        if (e instanceof RuntimeException) {
            return Status.NOT_FOUND.withDescription(e.getMessage());
        } else if (e instanceof BadRequestException) {
            return Status.INVALID_ARGUMENT.withDescription(e.getMessage());
        } else {
            return Status.INTERNAL.withDescription("An internal error occurred");
        }
    }
}