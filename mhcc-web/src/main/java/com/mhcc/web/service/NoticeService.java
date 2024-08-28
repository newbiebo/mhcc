package com.mhcc.web.service;

import com.mhcc.web.bean.dto.GetNoticesHistoryReq;
import com.mhcc.web.bean.dto.GetNoticesHistoryRes;

public interface NoticeService {

    GetNoticesHistoryRes getNoticesHistory(GetNoticesHistoryReq getNoticesHistoryReq);

}
