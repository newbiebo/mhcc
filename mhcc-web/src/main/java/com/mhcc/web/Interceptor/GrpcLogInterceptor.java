package com.mhcc.web.Interceptor;

import io.grpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrpcLogInterceptor implements ClientInterceptor {

    private static final Logger LOG =  LoggerFactory.getLogger(GrpcLogInterceptor.class);


    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor,
                                                               CallOptions callOptions, Channel channel) {
        LOG.info(methodDescriptor.getFullMethodName());

        return channel.newCall(methodDescriptor, callOptions);
    }
}
