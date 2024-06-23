package com.deepak.calling_3rdpartyapi.InheritanceDemo.SingleTable;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name="ST_user")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "user_type" ,
        discriminatorType = DiscriminatorType.INTEGER
)
@DiscriminatorValue(value = "0")
@Data
public class User {
    @Id
   private Long id ;

   private String Name ;
   private  String email ;
   private  String Rollno ;
}
