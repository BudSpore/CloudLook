package com.example.lisiyan.cloudlook.http.rx;

/**
 * Created by lisiyan on 2017/11/6.
 */

public class RxBusBaseMessage {

    private int code;
    private Object object;
    public RxBusBaseMessage(int code,Object object){
        this.code = code;
        this.object =object;
    }

    public int getCode() {
        return code;
    }

    public Object getObject() {
        return object;
    }
}
