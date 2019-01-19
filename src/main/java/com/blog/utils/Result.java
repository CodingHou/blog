package com.blog.utils;

import java.io.Serializable;

/**
 * FileName: Result
 * Author:   houchao
 * Date:     2019/1/19 6:16 PM
 * Description:
 */

public class Result implements Serializable {

    private String resMsg;

    private String resCode;

    private Boolean success;

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Result(String resMsg, String resCode, Boolean success, String data) {
        this.resMsg = resMsg;
        this.resCode = resCode;
        this.success = success;
        this.data = data;
    }

    public Result() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }
    public void fail(String code, String message) {
        this.success = false;
        this.resCode = code;
        this.resMsg = message;
    }
    public void success(String code, String message) {
        this.success = true;
        this.resCode = code;
        this.resMsg = message;
    }

}
