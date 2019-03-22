package com.colsubsidio;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitMqPublisher {


    private final static String QUEUE_NAME = "HOLA";

    public static void main(String... args) throws Exception{

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("nancho313");
        factory.setPassword("123");

        try(
                Connection connection = factory.newConnection();
                Channel channel  = connection.createChannel()
        ){

            channel.exchangeDeclare("exch_autorizaciones_taquilla", BuiltinExchangeType.FANOUT, true);
            String message = "HOLA HOLA";
            channel.basicPublish("exch_autorizaciones_taquilla", "", null, message.getBytes());
            System.out.println("Se envio el mensaje "+message);
        }
    }
}
