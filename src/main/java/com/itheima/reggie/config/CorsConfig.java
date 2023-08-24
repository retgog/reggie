package com.itheima.reggie.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//结果cors跨域问题 https://blog.csdn.net/sfh2018/article/details/116594698
//@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
 //               .allowedOrigins("http://localhost:90") //不可使用通配符
                .allowedOriginPatterns("*") //可使用通配符
                .allowedMethods("*")
//                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600)
                ;
    }
}
