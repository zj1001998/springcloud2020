package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;

import javax.annotation.Resource;

/**
 * @author aj
 * @create 2021-03-22 19:40
 */
public interface PaymentService {


    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
