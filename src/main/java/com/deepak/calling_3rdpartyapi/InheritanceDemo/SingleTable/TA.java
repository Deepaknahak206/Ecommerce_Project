package com.deepak.calling_3rdpartyapi.InheritanceDemo.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;


@Entity(name="ST_TA")
@DiscriminatorValue(value = "3")
@Data
public class TA extends User {
    private int noofSession ;
    private double rating ;
}
