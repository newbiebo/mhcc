package com.mhcc.web.service.client;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcNoticeClientService {

    @GrpcClient("notice-grpc-server")
    private Notice

}
