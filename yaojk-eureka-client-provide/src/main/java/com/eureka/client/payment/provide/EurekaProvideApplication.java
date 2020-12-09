package com.eureka.client.payment.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created with IntelliJ IDEA.
 * User: jiankang
 * Date: 2020-05-19
 * Time: 18:05
 * Description:
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableEurekaClient
@ComponentScan(basePackages = "com.eureka.client.payment")
@MapperScan(basePackages = "com.eureka.client.payment.provide.dao")
@EnableAsync
public class EurekaProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvideApplication.class, args);
    }
}