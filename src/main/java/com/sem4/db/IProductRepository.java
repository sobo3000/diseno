package com.sem4.db;
import com.tienda.entities.Product;
import org.springframework.data.repository.CrudRepository;
public interface IProductRepository extends CrudRepository<Product, Integer> {
}