package com.hxch.springutil.util;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @ClassName:RabbitMQSendMessage
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/18 0018 14:03
 **/

public class RabbitMQSendMessage {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws Exception{
        // 定义一个连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //
        factory.setHost("127.0.0.1");
        factory.setPort(5672);
        factory.setConnectionTimeout(10000);
        factory.setUsername("guest");
        factory.setPassword("guest");

        //获取一个连接
        Connection connection = factory.newConnection();
        //从连接中获取一个通道
        Channel channel = connection.createChannel();
        //声明交换机
        channel.exchangeDeclare("hxch", "direct", true);
        //声明一个队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        

        //发送消息
        for (int i =0; i< 1000000; i++){
            String message = "Hello RabbitMQ!"+"-"+i;
            channel.basicPublish("hxch", QUEUE_NAME, null, message.getBytes());
            System.out.println(message+"-"+i);
            Thread.sleep(2000);
        }
    }
}
