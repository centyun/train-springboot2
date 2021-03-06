package com.centyun.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityRequestMatcherProviderAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

import com.centyun.core.WebCoreConfig;
import com.centyun.web.WebBaseConfig;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@Import({WebCoreConfig.class, WebBaseConfig.class})
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class, SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class
        , SecurityFilterAutoConfiguration.class, SecurityRequestMatcherProviderAutoConfiguration.class})
public class CmsApplication {
    
    public static final String CODE = "cms";

    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
    }
    
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

}
