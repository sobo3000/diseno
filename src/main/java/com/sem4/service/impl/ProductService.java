package com.sem4.service.impl;

import com.tienda.db.IProductRepository;
import com.tienda.entities.Product;
import com.tienda.service.IProductService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductService implements IProductService {
    private final IProductRepository productRepository;
    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProducts() {
        return (List<Product>) this.productRepository.findAll();
    }
}