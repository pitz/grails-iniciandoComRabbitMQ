package com.pitzdev.bifrost.messagemanager

import com.rabbitmq.client.ConnectionFactory

class MessageManager {

    public static void publish(String queueName, String message) {
        ConnectionFactory factory = new ConnectionFactory()
        factory.host = "localhost"

        def connection = factory.newConnection()
        def channel = connection.createChannel()

        channel.queueDeclare(queueName, false, false, false, null)
        channel.basicPublish("", queueName, null, message.getBytes())

        channel.close()
        connection.close()
    }
   
}