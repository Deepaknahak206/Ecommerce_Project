package com.deepak.calling_3rdpartyapi.InheritanceDemo.TableSuperClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name="TPC_instructor")
@Data
public class Instructor extends User {
    private String Specialization ;
}
