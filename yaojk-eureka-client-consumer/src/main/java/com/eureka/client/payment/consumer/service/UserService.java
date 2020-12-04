package com.eureka.client.payment.consumer.service;

import com.eureka.client.payment.consumer.config.FeignConfiguration;
import com.eureka.client.payment.consumer.service.fallback.UserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: jiankang
 * Date: 2020-05-19
 * Time: 20:10
 * Description:
 */
@FeignClient(value = "yaojk-eureka-client-provide", configuration = FeignConfiguration.class, fallback = UserServiceFallBack.class)
public interface UserService {

    @RequestMapping(value = "/user/hello")
    String hello();
}