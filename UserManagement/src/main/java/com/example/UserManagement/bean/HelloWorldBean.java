package com.example.UserManagement.bean;

public class HelloWorldBean {
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public HelloWorldBean(String msg) {
        this.msg = msg;
    }

    public HelloWorldBean() {
    }
}
