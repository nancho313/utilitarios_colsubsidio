package com.colsubsidio;

import com.rabbitmq.client.*;

import java.io.IOException;

public class RabbitMqSubscriber {

    private final static String QUEUE_NAME = "queue_autorizaciones";

    public static void main(String... args) throws Exception{

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("nancho313");
        factory.setPassword("123");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, true, false, false, null);
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        DeliverCallback deliverCallback = new DeliverCallback() {
            @Override
            public void handle(String consumerTag, Delivery delivery) throws IOException {
                String message = new String(delivery.getBody(), "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
            }
        };

        channel.basicConsume(QUEUE_NAME, true, deliverCallback, new ConsumerShutdownSignalCallback() {
            @Override
            public void handleShutdownSignal(String consumerTag, ShutdownSignalException sig) {

                System.out.println("Entro por aca");
            }
        });
    }
}
