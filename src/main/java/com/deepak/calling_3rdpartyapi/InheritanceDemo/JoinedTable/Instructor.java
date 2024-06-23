package com.deepak.calling_3rdpartyapi.InheritanceDemo.JoinedTable;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name="JT_Insructor")
@Data
public class Instructor extends User{
    private String Specialization ;
}
