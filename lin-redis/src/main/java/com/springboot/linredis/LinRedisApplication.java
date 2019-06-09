package com.springboot.linredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LinRedisApplication {

    @Autowired
    private RedisTemplate redisTemplate;

    public static void main(String[] args) {
        SpringApplication.run(LinRedisApplication.class, args);
    }


    @RequestMapping("/testRedis")
    public String testRedis() {
        for (int i = 0; i < 10; i++) {
            redisTemplate.opsForValue().set("haha" + i, "himelin" + i);
        }
        return "OK";
    }
}
