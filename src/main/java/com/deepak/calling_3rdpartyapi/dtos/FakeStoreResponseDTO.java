package com.deepak.calling_3rdpartyapi.dtos;

import lombok.Data;

@Data
public class FakeStoreResponseDTO {
    public Long id ;
    private String Title ;
    private double Price ;
    private String Description ;
    private String Image ;
    private String category ;
}
