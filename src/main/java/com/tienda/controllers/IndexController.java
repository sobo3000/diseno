package com.tienda.controllers;

import com.tienda.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    private final IProductService productService;

    public IndexController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(Model model) {
        var productos = this.productService.getAllProducts();
        model.addAttribute("products", productos);
        return "index";
    }
}