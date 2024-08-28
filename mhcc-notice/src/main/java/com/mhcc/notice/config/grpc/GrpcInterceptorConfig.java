package com.mhcc.notice.config.grpc;

import com.mhcc.notice.Interceptor.GrpcLogInterceptor;
import io.grpc.ServerInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class GrpcInterceptorConfig {

    @GrpcGlobalServerInterceptor
    ServerInterceptor grpcLogInterceptor(){
        return new GrpcLogInterceptor();
    }

}
