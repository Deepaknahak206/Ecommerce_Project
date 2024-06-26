package com.deepak.calling_3rdpartyapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Product extends BaseModel{
    private String title ;
    private double Price ;
    private String description ;
    private String Image ;
    /* Product --> Category
       1 product many Category
       1category 1 product
    */
    @ManyToOne
//    @JoinColumn
    private  Category category ;
}
