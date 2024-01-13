package com.sakai.egmybatis2;

import com.sakai.egmybatis2.mapper.CustomersMapper;
import com.sakai.egmybatis2.pojo.entity.Customers;
import com.sakai.egmybatis2.pojo.entity.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class Egmybatis2ApplicationTests {
    @Autowired
    private CustomersMapper customersMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void insertTest() {
        Customers customers = new Customers();
        customers.setCustId("0004");
        customers.setCustTel("13811112222");
        customers.setCustName("Tony");
        customers.setAddress("成都");

        customersMapper.insert(customers);
    }

    @Test
    void insertOrder() {
        Orders orders = new Orders();
        orders.setOrderId("202301020004");
        orders.setCustId("0004");
        orders.setOrderDate(new Date());
        orders.setStatus("3");
        orders.setProductNum(4);
        orders.setAmt(800.88);
        System.out.println(customersMapper.insertOrder(orders));
    }

}
