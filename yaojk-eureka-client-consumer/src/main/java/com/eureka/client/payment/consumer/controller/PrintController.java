package com.eureka.client.payment.consumer.controller;

import com.eureka.client.payment.consumer.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: jiankang
 * Date: 2020-05-19
 * Time: 19:40
 * Description:
 */
@RequestMapping(value = "/print")
@RestController
public class PrintController {

    private Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/text")
    public String text() {
        System.out.println("method text()");
        return restTemplate.getForObject("http://localhost:8081/user/hello", String.class);
    }

    @RequestMapping(value = "/feign")
    public String feign() {
        LOG.info("method : hello()");
        return userService.hello();
    }
}