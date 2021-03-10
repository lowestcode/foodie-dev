package com.imooc.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 向系统外发送http请求的bean
     * @param builder
     * @return
     */
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    /**
     * 实现静态资源的映射(图片)
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //todo 修改地址
        registry.addResourceHandler("/**") //映射所有资源
                .addResourceLocations("classpath:/META-INF/resources/") // 重新映射swagger2地址
//                .addResourceLocations("file:F:\\maven\\apache-tomcat-7.0.105\\webapps\\");//映射本地静态资源
                .addResourceLocations("file:/workspaces/images/");//服务器的地址
    }
}
