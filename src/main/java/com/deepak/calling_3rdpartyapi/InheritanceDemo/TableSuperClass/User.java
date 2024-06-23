package com.deepak.calling_3rdpartyapi.InheritanceDemo.TableSuperClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity(name="TPC_user")
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@Data
public class User {
    @Id
   private Long id ;

   private String Name ;
   private  String email ;
   private  String Rollno ;
}
