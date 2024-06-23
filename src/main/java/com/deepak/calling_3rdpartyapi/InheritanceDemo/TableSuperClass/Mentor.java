package com.deepak.calling_3rdpartyapi.InheritanceDemo.TableSuperClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name="TPC_mentor")
@Data
public class Mentor extends User {
    private double mentorrating ;
}
