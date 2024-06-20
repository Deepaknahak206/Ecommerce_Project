package com.deepak.calling_3rdpartyapi.Controller;

import com.deepak.calling_3rdpartyapi.ExceptionHandling.ProductNotExist;
import com.deepak.calling_3rdpartyapi.Models.Product;
import com.deepak.calling_3rdpartyapi.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Products")
public class ProductController {

@Autowired
private ProductService ps ;

@GetMapping("/{id}")
    public ResponseEntity<Product> getproductbyId(@PathVariable("id") Long id){

    return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
    }

    @GetMapping("/")
    public List<Product> getAllProducts() throws ProductNotExist {
        return List.of(ps.getAllProducts());
    }
    @PostMapping("/")
    public Product createproduct(@RequestBody Product product){

        return ps.createProduct(product);
    }
    @PutMapping("")
    public  Product updateProduct(@RequestBody Product product){
        return new Product() ;
    }
    @DeleteMapping("/{id}") // No need of request body
    public void deleteProduct(){
      return ;
    }
}
