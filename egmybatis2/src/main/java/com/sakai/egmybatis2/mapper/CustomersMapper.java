package com.sakai.egmybatis2.mapper;

import com.sakai.egmybatis2.pojo.entity.Customers;
import com.sakai.egmybatis2.pojo.entity.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomersMapper {
    @Insert("INSERT INTO customers(cust_id,cust_tel,cust_name,address) VALUES (#{custId},#{custTel},#{custName},#{address})")
    int insert(Customers customers);

    @Insert("INSERT INTO user_orders(order_id, cust_id, order_date, status, products_num, amt) VALUES (#{orderId},#{custId},#{orderDate},#{status},#{productNum},#{amt})")
    int insertOrder(Orders orders);

}
