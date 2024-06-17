package com.deepak.calling_3rdpartyapi.Service;

import com.deepak.calling_3rdpartyapi.Models.Product;



public interface ProductService {

    Product getProductbyId(Long id) ;

    Product UpdateProduct(Long id) ;

    Product DeleteProduct(Long id) ;

    Product CreateProduct(Product p) ;
}
