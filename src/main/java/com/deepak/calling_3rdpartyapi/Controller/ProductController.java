package com.deepak.calling_3rdpartyapi.Controller;

import com.deepak.calling_3rdpartyapi.ExceptionHandling.ProductNotExist;
import com.deepak.calling_3rdpartyapi.Models.Product;
import com.deepak.calling_3rdpartyapi.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Products")
public class ProductController {

@Autowired
private ProductService ps ;
//    private AuthCommon authCommon;
//    public ProductController(@Qualifier("SelfProductService") ProductService productService,
//                             AuthCommon authCommon){
//        this.ps = productService;
//        this.authCommon = authCommon;
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") long id)  {

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

    @PutMapping("/{id}")
    public  Product updateProduct(@PathVariable("id") Long id , @RequestBody Product product){

    return ps.updateProduct(String.valueOf(id),product);
    }
    @DeleteMapping("/{id}") // No need of request body
    public void deleteProduct(){
      return ;
    }
}
