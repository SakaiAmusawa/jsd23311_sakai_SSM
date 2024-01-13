package com.sakai.egmybatis2;

import com.sakai.egmybatis2.mapper.ProductMapper;
import com.sakai.egmybatis2.pojo.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class productTest {
    @Autowired
    private ProductMapper productMapper;

    @Test
    void test() {
    }

    @Test
    void insertProductTest() {
        Product product = new Product();
        product.setTitle("西瓜");
        product.setPrice(5.0);
        product.setStock(1000);

        System.out.println(productMapper.insertProduct(product));
    }

    @Test
    void selectSingleProduct() {
        System.out.println(productMapper.selectSingleProduct(1));
    }

    @Test
    void deleteByIdTest() {
        System.out.println(productMapper.deleteById(1));
    }

    @Test
    void deleteByIds() {
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(2);
        ids.add(4);
        System.out.println(productMapper.deleteByIds(ids));
    }

    @Test
    void dynamicUpdateTest() {
        Product product = new Product();
        product.setId(3L);
        product.setTitle("橙子");
        System.out.println(productMapper.dynamicUpdate(product));
    }
}
