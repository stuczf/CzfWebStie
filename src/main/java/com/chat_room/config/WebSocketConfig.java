package com.chat_room.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Author: 陈志峰
 * @Date: 2022/11/11 16:01
 * @Description:
 */
@Configuration
public class WebSocketConfig {

    /**
     * @description 注入ServerEndpointExporter bean对象，自动注册使用了@ServerEndpoint()注解的bean
     * @author chenzhifeng@syncsoft.com
     * @date 2022/11/11 16:02
     * @param: []
     * @return org.springframework.web.socket.server.standard.ServerEndpointExporter
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
