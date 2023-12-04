package com.ibicd.springbootdemo.config;

import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

/**
 * 自定义上下文初始化器： 注册一个Bean： 用于过滤UserService,使其不要被注册（为了测试 TypeExcludeFilter 用）
 */
public class JulieApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
//        applicationContext.getBeanFactory().registerSingleton("typeExcludeFilter",new TypeExcludeFilter(){
//            @Override
//            public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) {
//                return metadataReader.getClassMetadata().getClassName().equals("com.ibicd.springbootdemo.web.UserService");
//            }
//        });
    }
}
