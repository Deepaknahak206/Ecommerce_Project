package com.deepak.calling_3rdpartyapi.InheritanceDemo.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name="ST_Mentor")
@DiscriminatorValue(value = "1")
@Data
public class Mentor extends User {
    private double mentorrating ;
}
