package com.hsbc.dec.team01.sms.sm.controlelrImpl;

import com.alibaba.fastjson.JSONObject;
import com.hsbc.dec.team01.sms.sm.controller.MicroServiceController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Kiltalaw
 * @Description:
 * @Date:2018/7/30 10:54
 * @Modify:
 **/
@RestController
public class MicroServiceControllerImpl implements MicroServiceController {
    @Override
    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String handleParams() {
        JSONObject json=new JSONObject();
        String helloWorld="Hello World!!";
        json.put("hello",helloWorld);

        return "result.html";
    }

}
