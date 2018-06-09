package com.example.productDetailV3.productDetailV3.Resource;

import com.example.productDetailV3.productDetailV3.Document.Product;
import com.example.productDetailV3.productDetailV3.Document.Uproductdetail;
import com.example.productDetailV3.productDetailV3.Repository.ProductRepository;
import com.example.productDetailV3.productDetailV3.Repository.UproductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.ApplicationPath;
import java.util.Optional;


@RestController
@RequestMapping("/product")
@ApplicationPath("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    ClientConsumer  clientConsumer;

    @Autowired
    UproductRepository uproductRepository;
    Uproductdetail uproductdetail ;


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Product product){
        productRepository.save(product);
    }

    @RequestMapping(value = "/{id}")
    public Optional<Product> read(@PathVariable String id) throws org.json.simple.parser.ParseException{

        String Name = (String) clientConsumer.covertJSON(id);
        // productDetail.setName(Name);
        System.out.println(Name);
        return productRepository.findById(id);

    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody() Product product, @PathVariable String id){
        productRepository.save(product);
    }
}
