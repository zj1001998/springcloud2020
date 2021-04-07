package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author aj
 * @create 2021-03-22 19:05
 */
@Mapper
public interface PaymentDao {

//    add,create,save
    public int create(Payment payment);

    public Payment getPaymentByID(@Param("id")Long id);
}
