package com.example.exam.tools;

import com.example.exam.bean.Msg;

/**
 * @author XBisA
 */
public class ResultUtil {

    /**
     * 请求成功返回
     */
    public static Msg success(Object data,Object pagination){
        Msg msg=new Msg();
        msg.setCode(200);
        msg.setMsg("success");
        msg.setPagination(pagination);
        msg.setData(data);
        return msg;
    }
    public static Msg success(){
        return success(null,null);
    }

    public static Msg error(Integer code,String resultmsg){
        Msg msg=new Msg();
        msg.setCode(code);
        msg.setMsg(resultmsg);
        return msg;
    }
}
