package com.mhcc.web.bean.http;

/**
 * Result status is returned
 */
public enum CustomStatus {
    /**
     * The request was successful
     */
    SUCCESS("000000", "SUCCESS"),
    /**
     * Parameters are missing
     */
    PARAM_MISS("100001", "PARAM_MISS_ERR"),
    /**
     * The parameter is invalid
     */
    PARAM_ERR("100002", "PARAM_ERR"),
    /**
     * Internal errors
     */
    INNER_ERR("100003", "INNER_ERR"),
    /**
     * Save failed
     */
    SAVE_ERR("100004", "SAVE_ERR"),
    /**
     * The request is made in the wrong way
     */
    REQUEST_METHOD_ERR("100005", "REQUEST_METHOD_ERR");

    private String code;
    private String message;

    CustomStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "CustomStatus{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
