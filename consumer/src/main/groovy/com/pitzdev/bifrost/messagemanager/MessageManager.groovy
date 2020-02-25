package com.pitzdev.bifrost.messagemanager

import com.rabbitmq.client.Channel
import com.rabbitmq.client.Connection
import com.rabbitmq.client.ConnectionFactory
import com.rabbitmq.client.Consumer
import com.rabbitmq.client.DeliverCallback
import com.rabbitmq.client.GetResponse

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

    public static void consume(String queueName) {
        ConnectionFactory factory = new ConnectionFactory()
        factory.host = "localhost"

        Connection connection = factory.newConnection()
        Channel channel = connection.createChannel()
        channel.queueDeclare(queueName, false,false,false,null)
        // Consumer consumer {}

        DeliverCallback deliverCallback = { consumerTag, delivery ->
            String receivedMessage = new String(delivery.getBody(), "UTF-8")
            println(" [x] Recebendo >> '" + receivedMessage + "'")
            sleep(300000)
            println(" [x] Recebido '" + receivedMessage + "'")
        };
        channel.basicConsume(queueName, deliverCallback, null)

        // println " response.body >> " + response.body
        // println " response.messageCount >> " + response.messageCount
    }
}