package com.springboot;

import com.springboot.condition.TulingAspect;
import com.springboot.condition.TulingConditional;
import com.springboot.condition.TulingLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LinBootApplication {

    @Autowired
    private RedisTemplate redisTemplate;

    public static void main(String[] args) {
        SpringApplication.run(LinBootApplication.class, args);
    }
    @Bean
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setDefaultSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }

    @RequestMapping("/testRedis")
    public String testRedis() {
        for (int i = 0; i < 10; i++) {
            redisTemplate.opsForValue().set("hei" + i, "himelin" + i);
        }
        return "OK";
    }

//    @Bean
    public TulingAspect tulingAspect() {
        System.out.println("TulingAspect组件自动装配到容器中");
        return new TulingAspect();
    }


//    @Bean
//    @Conditional(value = TulingConditional.class)
    public TulingLog tulingLog() {
        System.out.println("TulingLog组件自动装配到容器中");
        return new TulingLog();
    }
}
