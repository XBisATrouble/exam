package com.example.exam.bean;

/**
 * @author XBisA
 */
public class Msg<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 分页内容
     */
    private T pagination;

    /**
     * 具体内容
     */
    private T data;


    public T getPagination() {
        return pagination;
    }

    public void setPagination(T pagination) {
        this.pagination = pagination;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
