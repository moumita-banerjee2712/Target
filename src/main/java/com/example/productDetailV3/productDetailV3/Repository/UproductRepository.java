package com.example.productDetailV3.productDetailV3.Repository;

import com.example.productDetailV3.productDetailV3.Document.Uproductdetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UproductRepository extends MongoRepository<Uproductdetail,String> {
}
