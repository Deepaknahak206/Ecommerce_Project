package com.deepak.calling_3rdpartyapi.ExceptionHandling;


import org.springframework.http.ResponseEntity;

public class ProductNotExist  extends Exception{
    public ProductNotExist(String productNptFound) {
        super(productNptFound);
    }
}
