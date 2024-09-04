package com.mhcc.task.service;

import com.mhcc.common.constant.CONSTANT_TASK;
import com.mhcc.common.utils.IdWorker;
import com.mhcc.task.entity.TaskEntity;
import com.mhcc.task.mapper.TaskMapper;
import com.mhcc.task.proto.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

@GrpcService
public class TaskService extends TaskServiceGrpc.TaskServiceImplBase{

    @Resource
    private QuartzService quartzService;
    @Resource
    private TaskMapper taskMapper;

    @Override
    public void createTask(CreateTaskReq createTaskReq, StreamObserver<CreateTaskRes> responseObserver) {
        TaskEntity taskEntity = new TaskEntity();
//        taskEntity.setTaskId(IdWorker.nextId());
        taskEntity.setStatus(CONSTANT_TASK.STATUS_STOP);
        BeanUtils.copyProperties(createTaskReq,taskEntity);
        taskMapper.insert(taskEntity);
        CreateTaskRes build = CreateTaskRes.newBuilder().setResult(true).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();

    }

    @Override
    public void updateTask(UpdateTaskReq request, StreamObserver<UpdateTaskRes> responseObserver) {
        // todo
//        taskMapper.updateByPrimaryKeySelective()
        UpdateTaskRes build = UpdateTaskRes.newBuilder().setResult(true).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteTask(DeleteTaskReq request, StreamObserver<DeleteTaskRes> responseObserver) {
        // todo

        DeleteTaskRes build = DeleteTaskRes.newBuilder().setResult(true).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

}
