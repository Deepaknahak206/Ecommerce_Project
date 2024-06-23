package com.deepak.calling_3rdpartyapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Product extends BaseModel{
    private String Title ;
    private double Price ;
    private String Description ;
    private String Image ;
    /* Product --> Category
       1 product many Category
       1category 1 product
    */
    @ManyToOne
    private  Category category ;
}
