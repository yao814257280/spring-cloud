package com.eureka.client.payment.consumer.service.fallback;

import com.eureka.client.payment.consumer.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: jiankang
 * Date: 2020-11-26
 * Time: 18:50
 * Description:
 */
@Component
public class UserServiceFallBack implements UserService {

    @Override
    public String hello() {
        return "fail";
    }
}