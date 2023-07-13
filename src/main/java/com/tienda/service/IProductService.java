package com.tienda.service;

 

import com.tienda.entities.Product;

 

import java.util.List;
import java.util.Optional;

 

public interface IProductService extends IBaseService<Product, Integer> {

 

    List<Product> getProductsWithFilters(Optional<Integer> lowerPrice, Optional<Integer> higherPrice);
}