package com.example;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class SendMQ {
    private final static String QUEUE_NAME = "Hello";

    public static void main(String[] args) throws Exception {
        // connection是socket连接的抽象，并且为我们管理协议版本协商（protocol version negotiation），
        // 认证（authentication ）等等事情。这里我们要连接的消息代理在本地，因此我们将host设为“localhost”。
        // 如果我们想连接其他机器上的代理，只需要将这里改为特定的主机名或IP地址。
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(5672); //默认端口号
        factory.setUsername("lbl");//默认用户名
        factory.setPassword("123456");//默认密码
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        // 接下来，我们创建一个channel，绝大部分API方法需要通过调用它来完成。
        // 发送之前，我们必须声明消息要发往哪个队列，然后我们可以向队列发一条消息：
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message = "Hello world";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");
        channel.close();
        connection.close();
    }
}