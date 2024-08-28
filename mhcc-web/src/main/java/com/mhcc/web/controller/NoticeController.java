package com.mhcc.web.controller;

import com.mhcc.web.bean.dto.GetNoticesHistoryReq;
import com.mhcc.web.bean.dto.GetNoticesHistoryRes;
import com.mhcc.web.bean.http.CustomStatus;
import com.mhcc.web.bean.http.HttpMessage;
import com.mhcc.web.service.NoticeService;
import lombok.val;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/notice")
@RestController
public class NoticeController {

    @Resource
    private NoticeService noticeService;

    @RequestMapping("/getNoticesHistory")
    public HttpMessage<GetNoticesHistoryRes> getNoticesHistory(@RequestBody GetNoticesHistoryReq getNoticesHistoryReq){

        return new HttpMessage<>(noticeService.getNoticesHistory(getNoticesHistoryReq), CustomStatus.SUCCESS);

    }

}
