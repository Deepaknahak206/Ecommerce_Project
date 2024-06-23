package com.deepak.calling_3rdpartyapi.InheritanceDemo.SingleTable;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name="ST_instructor")
@DiscriminatorValue(value = "2")
@Data
public class Instructor extends User {
    private String Specialization ;
}
