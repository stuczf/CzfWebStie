package com.chat_room.controller;

import com.chat_room.constant.JsonMsgModelConstants;
import com.chat_room.entity.User;
import com.chat_room.entity.common.CommonResult;
import ma.glasnost.orika.MapperFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: 陈志峰
 * @Date: 2022/11/11 10:59
 * @Description: 登录
 */
@RestController
@RequestMapping("/service/login")
public class LoginController {

    private Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private MapperFactory mapperFactory;

    /**
     * @description 登录
     * @author chenzhifeng@syncsoft.com
     * @date 2022/11/11 15:56
     * @param: [map]
     * @return com.chat_room.entity.common.CommonResult
     */
    @RequestMapping("/login")
    public CommonResult Login(@RequestBody Map map) {
        try {
            User user = new User();
            user = mapperFactory.getMapperFacade().map(map, User.class);
            if (!(StringUtils.hasText(user.getName()) && StringUtils.hasText(user.getPassword()))) {
                return new CommonResult(JsonMsgModelConstants.paramIsNull, "用户名或密码为空，请重新输入！");
            } else if (!"123".equals(user.getPassword())) {
                return new CommonResult(JsonMsgModelConstants.objIsNull, "用户名或密码错误，请重新输入！");
            }
            return new CommonResult(JsonMsgModelConstants.SUCCESS, "登录成功", user);
        } catch (Exception e) {
            e.printStackTrace();
            return new CommonResult(JsonMsgModelConstants.FAILE, e.getMessage());
        }
    }
}
