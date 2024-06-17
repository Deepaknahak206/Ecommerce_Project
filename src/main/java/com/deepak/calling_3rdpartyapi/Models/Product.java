package com.deepak.calling_3rdpartyapi.Models;

import lombok.Data;

@Data
public class Product {
    private Long id ;
    private String Title ;
    private double Price ;
    private String Description ;
    private String Image ;
    private  Category category ;
}
