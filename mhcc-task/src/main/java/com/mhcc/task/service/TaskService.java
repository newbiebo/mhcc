package com.mhcc.task.service;

import com.mhcc.notice.proto.CreateTaskReq;
import com.mhcc.notice.proto.CreateTaskRes;
import com.mhcc.notice.proto.TaskServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import javax.annotation.Resource;

@GrpcService
public class TaskService extends TaskServiceGrpc.TaskServiceImplBase{

    @Resource
    private QuartzService quartzService;

    @Override
    public void createTask(CreateTaskReq createTaskReq, StreamObserver<CreateTaskRes> responseObserver) {

        CreateTaskRes build = CreateTaskRes.newBuilder().setResult(true).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();

    }

}
