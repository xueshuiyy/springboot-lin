package com.springboot.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * [功能描述]：
 * Copyright (c) 2019 Troila
 *
 * @author 杨 琳
 * @version 1.0, 2019/5/20
 * @since XTJCB
 */
public class TulingSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.springboot.service.TulingServiceImpl"};
    }
}
