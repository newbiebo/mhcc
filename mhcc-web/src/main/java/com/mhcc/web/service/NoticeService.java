package com.mhcc.web.service;

import com.mhcc.notice.proto.GetNoticesHistoryReq;
import com.mhcc.notice.proto.GetNoticesHistoryRes;

public interface NoticeService {

    GetNoticesHistoryRes getNoticesHistory(GetNoticesHistoryReq getNoticesHistoryReq);

}
