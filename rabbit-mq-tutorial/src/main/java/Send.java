import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Send {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("user");
        factory.setPassword("password");
        factory.setHost("localhost");
        /*
        Why try-with-resources is used here?
        -> we are connecting java application with rabbitmq using tcp which is expensive.
        -> Both factory.newConnection() and connection.createChannel() implement AutoClosable meaning when execution leaves the try block
            java automatically calls close method of both connection and channel.
         */
        try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()){
            channel.queueDeclare(QUEUE_NAME, true, false, false, Map.of("x-queue-type", "quorum"));
            String message = "Hello World";
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] Sent ' " + message + "'");
        }
    }
}
