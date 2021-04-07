package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author aj
 * @create 2021-04-07 14:15
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigMain3344 {
    public static void main(String[] args){

        SpringApplication.run(ConfigMain3344.class, args);
    }

}
