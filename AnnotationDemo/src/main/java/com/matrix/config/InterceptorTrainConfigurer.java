package com.matrix.config;

import com.matrix.handler.SourceAccessInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 实现spring类WebMvcConfigurer，创建配置类把拦截器添加到拦截器链中
 *
 * @Author: yihaosun
 * @Date: 2/22/2021 11:36
 */
@Configuration
public class InterceptorTrainConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SourceAccessInterceptor()).addPathPatterns("/**");
    }
}
