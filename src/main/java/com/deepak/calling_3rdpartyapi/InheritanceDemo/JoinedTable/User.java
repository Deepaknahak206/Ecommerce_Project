package com.deepak.calling_3rdpartyapi.InheritanceDemo.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity(name="JT_User")
@Inheritance(strategy= InheritanceType.JOINED)
@Data
public class User {
    @Id
   private Long id ;

   private String Name ;
   private  String email ;
   private  String Rollno ;
}
