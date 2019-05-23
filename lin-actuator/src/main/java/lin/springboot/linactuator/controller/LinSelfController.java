package lin.springboot.linactuator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinSelfController {

    @RequestMapping("/hello")
    public void sayHi() {
        System.out.println("say hi");
    }
}
