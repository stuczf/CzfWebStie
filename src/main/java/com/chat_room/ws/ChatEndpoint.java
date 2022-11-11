package com.chat_room.ws;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 陈志峰
 * @Date: 2022/11/11 15:56
 * @Description:
 */
@ServerEndpoint("/chat")
@Component
public class ChatEndpoint {

    // 用来存储每一个客户端对象对应的ChatEndpoint对象
    private static Map<Object, ChatEndpoint> onlineUsers = new ConcurrentHashMap<>();

    // 声明Session对象，通过该对象可以发送消息给指定用户
    private Session session;

    // 声明一个HttpSession对象，里面存储着用户信息

    /**
     * @description 连接建立时被调用
     * @author chenzhifeng@syncsoft.com
     * @date 2022/11/11 15:58
     * @param: [session, config]
     * @return void
     */
    @OnOpen
    public void onOpen(Session session, EndpointConfig config) {

    }

    /** 
     * @description 接收到客户端发送的数据时被调用
     * @author chenzhifeng@syncsoft.com
     * @date 2022/11/11 15:58
     * @param: [message, session]
     * @return void
     */
    @OnMessage
    public void onMessage(String message, Session session) {

    }

    /** 
     * @description 连接关闭时被调用
     * @author chenzhifeng@syncsoft.com
     * @date 2022/11/11 15:59
     * @param: [session]
     * @return void
     */
    @OnClose
    public void onClose(Session session) {
        
    }
}
