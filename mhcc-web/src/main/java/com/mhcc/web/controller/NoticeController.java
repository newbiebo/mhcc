package com.mhcc.web.controller;

import com.mhcc.notice.proto.GetNoticesHistoryReq;
import com.mhcc.notice.proto.GetNoticesHistoryRes;
import com.mhcc.web.bean.http.CustomStatus;
import com.mhcc.web.bean.http.HttpMessage;
import com.mhcc.web.service.NoticeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/notice")
@RestController
public class NoticeController {

    @Resource
    private NoticeService noticeService;

    @RequestMapping(value = "/getNoticesHistory", method = RequestMethod.GET)
//    public HttpMessage<GetNoticesHistoryRes> getNoticesHistory(@RequestBody GetNoticesHistoryReq getNoticesHistoryReq){
    public HttpMessage<String> getNoticesHistory(){
        GetNoticesHistoryRes getNoticesHistoryRes = noticeService.getNoticesHistory(GetNoticesHistoryReq.newBuilder().setName("1").build());

        return new HttpMessage<>(getNoticesHistoryRes.getMessage(), CustomStatus.SUCCESS);

    }

}
