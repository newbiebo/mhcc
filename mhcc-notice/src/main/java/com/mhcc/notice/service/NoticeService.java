package com.mhcc.notice.service;


import com.mhcc.notice.proto.GetNoticesHistoryReq;
import com.mhcc.notice.proto.GetNoticesHistoryRes;
import com.mhcc.notice.proto.NoticeServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class NoticeService extends NoticeServiceGrpc.NoticeServiceImplBase {

    @Override
    public void getNoticesHistory(GetNoticesHistoryReq getNoticesHistoryReq, StreamObserver<GetNoticesHistoryRes> responseObserver){

        GetNoticesHistoryRes getNoticesHistoryRes = GetNoticesHistoryRes.newBuilder().setMessage("mmm").build();
        responseObserver.onNext(getNoticesHistoryRes);
        responseObserver.onCompleted();
    }
}
