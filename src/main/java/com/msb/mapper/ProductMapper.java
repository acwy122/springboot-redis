package com.msb.mapper;

import com.msb.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProductMapper {

    public Product findProductById(Integer id);
}
