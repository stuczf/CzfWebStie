package com.chat_room.controller;

import com.chat_room.constant.JsonMsgModelConstants;
import com.chat_room.entity.common.CommonResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: 陈志峰
 * @Date: 2022/11/1 10:30
 * @Description:
 */
@RestController
@RequestMapping("/test_controller")
public class TestController {

    @RequestMapping("/hello")
    public String helloWorld(String str) {
        return "hello world!" + str + "哈哈哈";
    }

    @RequestMapping("/test1")
    public CommonResult test1(@RequestBody Map map) {
        return new CommonResult(JsonMsgModelConstants.SUCCESS, JsonMsgModelConstants.getMsg(JsonMsgModelConstants.SUCCESS), map.get("user_name"));
    }
}
