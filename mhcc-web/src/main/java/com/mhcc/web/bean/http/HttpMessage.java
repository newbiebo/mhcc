package com.mhcc.web.bean.http;

import lombok.Data;

@Data
public class HttpMessage<T> {

    private T content;
    private String code;
    private String message;

    public HttpMessage() {

    }

    public HttpMessage(CustomStatus customStatus) {
        this.code = customStatus.getCode();
        this.message = customStatus.getMessage();
    }

    public HttpMessage(T content, CustomStatus customStatus) {
        this.content = content;
        this.code = customStatus.getCode();
        this.message = customStatus.getMessage();
    }

    public HttpMessage(T content, String code, String message) {
        this.content = content;
        this.code = code;
        this.message = message;
    }
}
