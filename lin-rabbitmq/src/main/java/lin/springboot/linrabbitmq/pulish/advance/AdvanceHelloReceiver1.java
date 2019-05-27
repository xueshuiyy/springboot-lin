package lin.springboot.linrabbitmq.pulish.advance;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class AdvanceHelloReceiver1 {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver 1 : " + hello);
    }
}
