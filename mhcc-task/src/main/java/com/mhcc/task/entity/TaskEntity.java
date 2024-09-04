package com.mhcc.task.entity;

import com.mhcc.common.constant.CONSTANT_TASK;
import com.mhcc.common.entity.base.DaoEntity;
import lombok.Data;

import java.util.Date;

@Data
public class TaskEntity extends DaoEntity {
    private String id;
    private String taskId;
    private String taskName;
    private String taskGroup;
    private String taskType;
    private String expression;
    private String status;
    private Date gmtCreate;
    private Date gmtModified;
    private boolean isDelete;
}
