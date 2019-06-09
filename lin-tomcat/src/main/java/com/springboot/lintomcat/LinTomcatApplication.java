package com.springboot.lintomcat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LinTomcatApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(LinTomcatApplication.class, args);
    }

    @Value("${server.port}")
    public String port;

    @RequestMapping("/getPort")
    public String getPort() {

        return port;
    }
}
