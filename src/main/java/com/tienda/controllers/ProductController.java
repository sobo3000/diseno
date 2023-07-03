package com.tienda.controllers;

import com.tienda.entities.Product;
import com.tienda.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ProductController {
    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public String index(Model model) {

        model.addAttribute("productDefault", new Product());
        model.addAttribute("products", this.productService.getAll());
        return "product";
    }

}