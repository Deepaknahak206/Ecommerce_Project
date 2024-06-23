package com.deepak.calling_3rdpartyapi.InheritanceDemo.JoinedTable;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name="JT_TA")
@Data
public class TA extends User{
    private int noofSession ;
    private double rating ;
}
