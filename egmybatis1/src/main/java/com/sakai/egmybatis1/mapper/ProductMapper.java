package com.sakai.egmybatis1.mapper;

import com.sakai.egmybatis1.pojo.entity.Product;
import com.sakai.egmybatis1.pojo.vo.ProductVoTitlePrice;
import com.sakai.egmybatis1.pojo.vo.ProductVoTitleStock;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Insert("INSERT INTO product (title,price,stock) VALUES (#{title},#{price},#{stock})")
    int insert(Product product);

    @Select("SELECT title,price FROM product WHERE id = #{id} ")
    ProductVoTitlePrice selectTitlePrice(int id);

    @Delete("DELETE FROM product WHERE id = #{id}")
    int productDelete(int id);

    @Select("SELECT title,stock FROM product")
    List<ProductVoTitleStock> selectAll();

}
