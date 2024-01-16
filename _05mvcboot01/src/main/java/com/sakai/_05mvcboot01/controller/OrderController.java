package com.sakai._05mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @RequestMapping("/v1/orders/createdOrder")
    @ResponseBody
    public String createdOrder() {
        return "订单创建成功，请支付";
    }
}
