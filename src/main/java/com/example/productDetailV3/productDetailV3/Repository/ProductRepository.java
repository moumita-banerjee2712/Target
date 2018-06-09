package com.example.productDetailV3.productDetailV3.Repository;

import com.example.productDetailV3.productDetailV3.Document.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String>{
}
