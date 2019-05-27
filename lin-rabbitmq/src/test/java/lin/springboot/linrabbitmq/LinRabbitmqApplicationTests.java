package lin.springboot.linrabbitmq;

import lin.springboot.linrabbitmq.pulish.HelloSender;
import lin.springboot.linrabbitmq.pulish.HelloSender2;
import lin.springboot.linrabbitmq.pulish.UserDTO;
import lin.springboot.linrabbitmq.pulish.advance.AdvanceHelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LinRabbitmqApplicationTests {
    @Autowired
    private HelloSender helloSender;

    @Autowired
    private HelloSender2 helloSender2;

    @Autowired
    private AdvanceHelloSender advanceHelloSender;

    @Test
    public void hello() throws Exception {
//        helloSender.send();
    }

    @Test
    public void oneToMany() throws Exception {
        /*for (int i=0;i<100;i++){
            helloSender.send(i);
            helloSender2.send(i);
        }*/
//        UserDTO userDTO = new UserDTO();
//        userDTO.setUserName("yangyang");
//        userDTO.setAge("10");
//        helloSender.send(userDTO);
    }

    @Test
    public void hello2() throws Exception {
        advanceHelloSender.send1();
        advanceHelloSender.send2();
    }

}
