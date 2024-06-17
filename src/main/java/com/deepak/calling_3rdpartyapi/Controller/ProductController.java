package com.deepak.calling_3rdpartyapi.Controller;

import com.deepak.calling_3rdpartyapi.Models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {
@GetMapping("/{id}")
    public Product getproductbyId(@PathVariable("id") String id){
           return new Product() ;
    }

    @GetMapping("/")
    public List<Product> getallproduct(){
    return null ;
    }
    @PostMapping("/")
    public Product createproduct(@RequestBody Product product){
          return  new Product() ;
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
