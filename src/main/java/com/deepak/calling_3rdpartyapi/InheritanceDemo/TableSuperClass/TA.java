package com.deepak.calling_3rdpartyapi.InheritanceDemo.TableSuperClass;

import jakarta.persistence.Entity;
import lombok.Data;
@Entity(name="TPC_TA")
@Data
public class TA extends User {
    private int noofSession ;
    private double rating ;
}
