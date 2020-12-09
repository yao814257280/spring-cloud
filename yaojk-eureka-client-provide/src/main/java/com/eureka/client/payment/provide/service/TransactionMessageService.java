package com.eureka.client.payment.provide.service;

import com.eureka.client.payment.provide.po.TransactionMessage;

/**
 * Created with IntelliJ IDEA.
 * User: jiankang
 * Date: 12/9/20
 * Time: 1:54 PM
 * Description:
 */
public interface TransactionMessageService extends IService<TransactionMessage> {


    void insertMessage();
}