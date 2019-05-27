package lin.springboot.linrabbitmq.config;

import org.springframework.amqp.core.Queue;

public class RabbitConfig {

    public Queue queue() {
        return new Queue("abcd");
    }
}
