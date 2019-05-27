package lin.springboot.linrabbitmq.pulish;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int times) {
        String context = "hello " + new Date() + "      " + times;
//        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

    public void send(UserDTO userDTO) {
        System.out.println("Sender : " + userDTO.toString());
        this.rabbitTemplate.convertAndSend("hello", userDTO.toString());
    }
}
