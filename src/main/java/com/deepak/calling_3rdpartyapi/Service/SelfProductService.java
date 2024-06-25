package com.deepak.calling_3rdpartyapi.Service;

import com.deepak.calling_3rdpartyapi.ExceptionHandling.ProductNotExist;
import com.deepak.calling_3rdpartyapi.Models.Product;
import com.deepak.calling_3rdpartyapi.Repo.ProductRepo;
import org.springframework.stereotype.Service;


@Service("SelfProductService")
public class SelfProductService implements  ProductService{

private ProductRepo productRepo ;
SelfProductService(ProductRepo productRepo){
    this.productRepo=productRepo ;
}
    @Override
    public Product getProductById(long id) throws ProductNotExist {
        return null;
    }

    @Override
    public Product DeleteProduct(Long id) {
        return null;
    }

    @Override
    public Product[] getAllProducts() throws ProductNotExist {
        return new Product[0];
    }

    @Override
    public Product createProduct(Product p) {

     Product saveProduct = productRepo.save(p);
      return saveProduct ;
    }

    @Override
    public Product updateProduct(String id, Product product) {
        return null;
    }
}
