package com.eureka.client.payment.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created with IntelliJ IDEA.
 * User: jiankang
 * Date: 2020-05-19
 * Time: 18:05
 * Description:
 */
@EnableFeignClients(basePackages = "com.eureka.client.payment.consumer")
@EnableHystrix // 开启断路器功能（容错性）
@EnableEurekaClient
@SpringBootApplication
public class EurekaProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvideApplication.class, args);
    }
}