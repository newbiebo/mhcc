package com.mhcc.web.service.impl;

import com.mhcc.notice.proto.GetNoticesHistoryReq;
import com.mhcc.notice.proto.GetNoticesHistoryRes;
import com.mhcc.web.Interceptor.GrpcLogInterceptor;
import com.mhcc.web.service.NoticeService;
import com.mhcc.web.service.client.GrpcNoticeClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class NoticeServiceImpl implements NoticeService {

    private static final Logger LOG =  LoggerFactory.getLogger(NoticeServiceImpl.class);

    @Resource
    private GrpcNoticeClientService grpcNoticeClientService;

    /**
     * @param getNoticesHistoryReq
     * @return
     */
    @Override
    public GetNoticesHistoryRes getNoticesHistory(GetNoticesHistoryReq getNoticesHistoryReq) {
        return  grpcNoticeClientService.getNoticesHistory(getNoticesHistoryReq);
    }
}
