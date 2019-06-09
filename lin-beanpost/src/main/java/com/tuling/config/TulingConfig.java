package com.tuling.config;

import com.tuling.compent.TulingCompent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by smlz on 2019/4/3.
 */
@Configuration
public class TulingConfig {

    @Bean(initMethod = "init")
    public TulingCompent tulingCompent() {
        return new TulingCompent();
    }

}
