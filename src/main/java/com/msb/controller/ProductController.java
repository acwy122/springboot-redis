package com.msb.controller;

import com.msb.pojo.Product;
import com.msb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/show")
    public String findProductById(Integer id , Model model){
        Product product = productService.findProductById(id);
        model.addAttribute(product);
        return "show";
    }


}
