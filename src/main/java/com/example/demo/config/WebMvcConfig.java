package com.example.demo.config;

import com.example.demo.controller1.smile.helloworldsmile;
import com.example.demo.controller1.smile.helloworldsmile2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerTypePredicate;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configure) {
        configure.addPathPrefix("v1", HandlerTypePredicate.forAssignableType(helloworldsmile.class));
        configure.addPathPrefix("apis", HandlerTypePredicate.forBasePackage("com.example.demo"));
    }
}
