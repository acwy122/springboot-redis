package com.msb.service.impl;

import com.msb.mapper.ProductMapper;
import com.msb.pojo.Product;
import com.msb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product findProductById(Integer id) {
        return productMapper.findProductById(id);
    }
}
