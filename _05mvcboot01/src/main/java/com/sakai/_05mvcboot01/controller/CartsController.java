package com.sakai._05mvcboot01.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartsController {
    //添加购物车功能
    @RequestMapping("/v1/users/carts/addProduct")
    @ResponseBody
    /**
     * 接受数据的方式1：通过HttpServletRequest
     * 1.GET方式
     *  http://localhost:8080/v1/users/carts/addProduct?title=huaweimate50&price=8000
     * 2.POST方式
     *  <input type="text" name="title">
     *  <input type="text" name="price">
     */ public String addProduct(HttpServletRequest request) {
        String title = request.getParameter("title");
        String price = request.getParameter("price");
        return "添加成功" + title + "---" + price;
    }

    /**
     * 接收参数方式2：声明参数方式接受
     * 删除购物车商品功能
     * 地址 /v1/carts/delete
     * 方法:GET
     * 查询参数：username、id
     * 返回响应：成功删除
     */
}
