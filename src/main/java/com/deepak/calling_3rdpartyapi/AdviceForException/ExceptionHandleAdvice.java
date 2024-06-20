package com.deepak.calling_3rdpartyapi.AdviceForException;

import com.deepak.calling_3rdpartyapi.ExceptionHandling.ProductNotExist;
import com.deepak.calling_3rdpartyapi.dtos.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandleAdvice {
  @ExceptionHandler(ProductNotExist.class)
  public ResponseEntity<ExceptionResponseDTO> handleProductNotfoundexception(){
      ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO();
      exceptionResponseDTO.setMessage("Product Does not Exsit");
      exceptionResponseDTO.setStatus(HttpStatus.NOT_ACCEPTABLE);
      return new ResponseEntity<>(exceptionResponseDTO,HttpStatus.NOT_ACCEPTABLE) ;
  }
}
