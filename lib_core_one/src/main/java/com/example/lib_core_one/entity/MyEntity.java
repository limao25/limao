package com.example.lib_core_one.entity;

public class MyEntity<T> {

    private int code;
    private String msg;
    private T data;

//    public MyEntity(int code, T data, String msg) {
//        this.code = code;
//        this.Data = data;
//        this.Msg = msg;
//    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MyEntity{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
