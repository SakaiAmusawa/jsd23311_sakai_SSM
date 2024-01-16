package com.sakai._05mvcboot01.controller;

import com.sakai._05mvcboot01.pojo.dto.UpdateDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartsController {

    /**
     * 接受数据的方式1：通过HttpServletRequest
     * <p>
     * 1.GET方式
     * <a href="http://localhost:8080/v1/users/carts/addProduct?title=huaweimate50&price=8000">测试链接</a>
     * <p>
     * 2.POST方式
     * <input type="text" name="title">
     * <input type="text" name="price">
     */
    @RequestMapping("/v1/users/carts/addProduct")
    @ResponseBody
    public String addProduct(HttpServletRequest request) {
        String title = request.getParameter("title");
        String price = request.getParameter("price");
        return "添加成功" + title + "---" + price;
    }

    /**
     * 接收参数方式2：声明参数方式接受
     * <p>
     * 删除购物车商品功能
     * <p>
     * 地址 /v1/carts/delete
     * <p>
     * 方法:GET
     * <p>
     * 查询参数：username、id
     * <p>
     * 返回响应：成功删除
     */

    @RequestMapping("/v1/carts/delete")
    @ResponseBody
    //                          参数要严格对应GET中的参数
    public String deleteProduct(String username, Integer id) {
        return "成功删除" + username + id;
    }

    /**
     * 接收数据方式2：声明POJO类方式
     * <p>
     * 修改购物车
     * <p>
     * 请求地址：/v1/carts/update
     * <p>
     * 请求参数：title、price、number
     * <p>
     * 返回响应：字符串
     */
    @RequestMapping("/v1/carts/update")
    @ResponseBody
    public String updateProduct(UpdateDTO updateDTO) {
        String title = updateDTO.getTitle();
        Double price = updateDTO.getPrice();
        Integer number = updateDTO.getNumber();
        return "更新成功" + title + price + number;
    }
}
