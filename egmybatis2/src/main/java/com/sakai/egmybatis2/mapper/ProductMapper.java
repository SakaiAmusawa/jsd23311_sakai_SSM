package com.sakai.egmybatis2.mapper;

import com.sakai.egmybatis2.pojo.entity.Product;
import com.sakai.egmybatis2.pojo.vo.ProductVO1;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ProductMapper {

    //插入一条数据
    int insertProduct(Product product);

    //通过id查询一个商品的标题和价格
    ProductVO1 selectSingleProduct(int id);

    //通过id删除一个商品的信息
    int deleteById(int id);

    //通过id批量删除商品信息 List集合方式
    int deleteByIds(ArrayList<Integer> list);

    //通过id动态的修改商品信息
    int dynamicUpdate(Product product);

}
