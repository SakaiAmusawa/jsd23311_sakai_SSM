package com.sakai.egmybatis1;

import com.sakai.egmybatis1.mapper.ProductMapper;
import com.sakai.egmybatis1.pojo.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Egmybatis1ApplicationTests {
    @Autowired
    private ProductMapper productMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void insertProduct() {
        Product product = new Product();
        product.setTitle("西瓜");
        product.setPrice(5.0);
        product.setStock(10);

        System.out.println(productMapper.insert(product));
    }

    @Test
    void selectTitlePriceTest() {
        System.out.println(productMapper.selectTitlePrice(1));
    }

    @Test
    void productDeleteTest() {
        System.out.println(productMapper.productDelete(2));

    }

    @Test
    void productTitleStockTest() {
        System.out.println(productMapper.selectAll());
    }
}
