package com.deepak.calling_3rdpartyapi.dtos;

import com.deepak.calling_3rdpartyapi.Models.Category;
import lombok.Data;

@Data
public class FakeStoreResposeDTO {
    public Long id ;
    private String Title ;
    private double Price ;
    private String Description ;
    private String Image ;
    private String category ;
}
