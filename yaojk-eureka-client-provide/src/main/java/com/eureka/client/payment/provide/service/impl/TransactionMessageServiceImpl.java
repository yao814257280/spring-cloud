package com.eureka.client.payment.provide.service.impl;

import com.eureka.client.payment.provide.po.TransactionMessage;
import com.eureka.client.payment.provide.service.TransactionMessageService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: jiankang
 * Date: 12/9/20
 * Time: 1:55 PM
 * Description:
 */
@Service
public class TransactionMessageServiceImpl extends BaseService<TransactionMessage> implements TransactionMessageService {

    @Override
    public void insertMessage() {
        TransactionMessage message = new TransactionMessage();
        message.setMessage("{}");
        message.setQueue("q1");
        insert(message);
    }
}