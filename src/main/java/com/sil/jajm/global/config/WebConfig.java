package com.sil.jajm.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//    @Bean
//    public View jsonView() {
//        return new MappingJackson2JsonView();
//    }
//
//    @Bean
//    public BeanNameViewResolver beanNameViewResolver() {
//        BeanNameViewResolver resolver = new BeanNameViewResolver();
//        resolver.setOrder(0);
//        return resolver;
//    }

    /**
     * 외부파일리소스경로설정(에디터이미지 등)
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //static
        registry
                .addResourceHandler("/assets/**")
                .addResourceLocations("classpath:/static/img/");

        registry
                .addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
