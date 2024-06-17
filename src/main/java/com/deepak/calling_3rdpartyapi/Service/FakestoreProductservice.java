package com.deepak.calling_3rdpartyapi.Service;

import com.deepak.calling_3rdpartyapi.Models.Product;

public class FakestoreProductservice implements  ProductService{
    @Override
    public Product getProductbyId(Long id) {
        return null;
    }

    @Override
    public Product UpdateProduct(Long id) {
        return null;
    }

    @Override
    public Product DeleteProduct(Long id) {
        return null;
    }

    @Override
    public Product CreateProduct(Product p) {
        return null;
    }
}
