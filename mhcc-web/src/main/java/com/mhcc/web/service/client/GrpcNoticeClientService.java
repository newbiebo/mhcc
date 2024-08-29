package com.mhcc.web.service.client;

import com.mhcc.notice.proto.GetNoticesHistoryReq;
import com.mhcc.notice.proto.GetNoticesHistoryRes;
import com.mhcc.notice.proto.NoticeServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcNoticeClientService {

    @GrpcClient("notice-grpc-server")
    private NoticeServiceGrpc.NoticeServiceBlockingStub noticeServiceBlockingStub;

    public GetNoticesHistoryRes getNoticesHistory(GetNoticesHistoryReq req) {
        GetNoticesHistoryRes getNoticesHistoryRes = noticeServiceBlockingStub.getNoticesHistory(req);
        return getNoticesHistoryRes;
    }

}
