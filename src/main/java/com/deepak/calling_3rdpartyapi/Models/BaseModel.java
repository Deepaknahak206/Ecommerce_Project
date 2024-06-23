package com.deepak.calling_3rdpartyapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Data
@MappedSuperclass
public class BaseModel {
    @Id
    private Long id ;

    private Date createdDate ;
    private Date UpdateDate ;
}
