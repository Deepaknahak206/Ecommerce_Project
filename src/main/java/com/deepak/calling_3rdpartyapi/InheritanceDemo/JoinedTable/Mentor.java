package com.deepak.calling_3rdpartyapi.InheritanceDemo.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity(name="JT_Mentor")
@Data
public class Mentor extends User{
    private double mentorrating ;

    @PrimaryKeyJoinColumn
    private long user_id ;
}
