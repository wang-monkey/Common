package com.wangzn.controller;

import com.alibaba.fastjson.JSONObject;
import com.wangzn.model.TpmTestLog;
import com.wangzn.service.TpmTestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TpmTestLogService tpmTestLogService;

    @GetMapping("/testDatabase")
    public JSONObject testDatabase(){

        JSONObject jsonObject = new JSONObject();
        TpmTestLog tpmTestLog = new TpmTestLog();
        tpmTestLog.setSyscreatedate("asfasgags");
        tpmTestLog.setTestmainUuid("fdasgassfsarew");
        tpmTestLog.setOperation("新增");
        tpmTestLogService.ceshi(tpmTestLog);
        jsonObject.put("title", "测试成功" + tpmTestLog.getLogUuid());
        return jsonObject;
    }
    @GetMapping("/testGet")
    public JSONObject testGet()
    {
        JSONObject jsonObject = new JSONObject(); //创建Json对象
        jsonObject.put("data", "服务器数据来了"+new Exception().getStackTrace()[0].getMethodName());     //设置Json对象的属性
        return jsonObject;
    }
    @PostMapping("/testPost")
    public JSONObject testPost()
    {
        JSONObject jsonObject = new JSONObject(); //创建Json对象
        jsonObject.put("data", "服务器数据来了"+new Exception().getStackTrace()[0].getMethodName());     //设置Json对象的属性
        return jsonObject;
    }
}