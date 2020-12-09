package com.eureka.client.payment.provide.web.controller;

import com.eureka.client.payment.provide.service.TransactionMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: jiankang
 * Date: 2020-05-19
 * Time: 19:37
 * Description:  // @RefreshScope nacos配置中心数据更新
 */
@RequestMapping(value = "/user")
@RestController
@RefreshScope
public class UserController {

    private Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private TransactionMessageService transactionMessageService;

    @Value("${message:初始值}")
    private String message;

    @RequestMapping("/hello")
    public String hello() {
        LOG.info("method : hello()");
        transactionMessageService.insertMessage();
        return message;
    }
}