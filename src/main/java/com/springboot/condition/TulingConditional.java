package com.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * [功能描述]：
 * Copyright (c) 2019 Troila
 *
 * @author 杨 琳
 * @version 1.0, 2019/5/20
 * @since XTJCB
 */
public class TulingConditional implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 容器中包含tulingAspect组件才返回Ture
        if(conditionContext.getBeanFactory().containsBean("tulingAspect")){
            return true;
        }else{
            return false;
        }
    }
}
