package com.sakai._05mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartsController {
    @RequestMapping("/v1/users/cartsProduct")
    @ResponseBody
    public String addProduct() {

        return "添加成功";
    }
}
