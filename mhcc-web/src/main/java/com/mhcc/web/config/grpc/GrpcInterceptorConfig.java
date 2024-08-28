package com.mhcc.web.config.grpc;

import com.mhcc.web.Interceptor.GrpcLogInterceptor;
import io.grpc.ClientInterceptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Order(Ordered.LOWEST_PRECEDENCE)
@Configuration(proxyBeanMethods = false)
public class GrpcInterceptorConfig {

    @GrpcGlobalClientInterceptor
    ClientInterceptor grpcLogInterceptor(){
        return new GrpcLogInterceptor();
    }

}
