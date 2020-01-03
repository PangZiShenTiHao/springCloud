package com.hxch.springutil.util;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * @ClassName:RabbitMQReceiveMessage
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/18 0018 14:13
 **/

public class RabbitMQReceiveMessage_02 {

    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws Exception{
        //定义一个连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务器地址
        factory.setHost("127.0.0.1");
        factory.setPort(5672);
        factory.setConnectionTimeout(10000);
        factory.setUsername("guest");
        factory.setPassword("guest");

        //获取一个连接
        Connection connection = factory.newConnection();
        //获取一个通道
        Channel channel = connection.createChannel();
        //声明交换机
        channel.exchangeDeclare("hxch", "direct", true);
        //定义队列的消费者
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            //获取到达的消息
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消息来了");
                super.handleDelivery(consumerTag, envelope, properties, body);
                String msg = new String(body,"utf-8");
                System.out.println("02号 "+msg);
            }
        };
        //监听队列
        channel.basicConsume(QUEUE_NAME,true,defaultConsumer);
    }

}
