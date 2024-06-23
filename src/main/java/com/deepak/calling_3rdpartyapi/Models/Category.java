package com.deepak.calling_3rdpartyapi.Models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Category extends BaseModel{
   private String title ;
}
