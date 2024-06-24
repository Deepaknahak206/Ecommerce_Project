package com.deepak.calling_3rdpartyapi.Service;

import com.deepak.calling_3rdpartyapi.ExceptionHandling.ProductNotExist;
import com.deepak.calling_3rdpartyapi.Models.Product;

public interface ProductService {

    Product getProductById(long id) throws ProductNotExist;
    Product DeleteProduct(Long id) ;

    Product[] getAllProducts() throws ProductNotExist;


    Product createProduct(Product p);

    Product updateProduct(String id, Product product);


}
