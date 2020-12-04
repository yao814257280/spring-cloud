package com.eureka.client.payment.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 * User: jiankang
 * Date: 2020-05-19
 * Time: 18:05
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvideApplication.class, args);
    }
}