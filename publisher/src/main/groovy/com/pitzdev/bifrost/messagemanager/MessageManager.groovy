package com.pitzdev.bifrost.messagemanager

import com.rabbitmq.client.Channel
import com.rabbitmq.client.Connection
import com.rabbitmq.client.ConnectionFactory

class MessageManager {

    public static void publish(String queueName, String message) {
        ConnectionFactory factory = new ConnectionFactory()
        factory.host = "localhost"

        Connection connection = factory.newConnection()
        Channel channel = connection.createChannel()

        channel.queueDeclare(queueName, false, false, false, null)
        channel.basicPublish("", queueName, null, message.getBytes())

        channel.close()
        connection.close()
    }
}