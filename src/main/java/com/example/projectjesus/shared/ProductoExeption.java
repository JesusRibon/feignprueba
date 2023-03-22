package com.example.projectjesus.shared;

import org.springframework.http.HttpStatus;

public class ProductoExeption extends BaseException{
public ProductoExeption(String message){
  super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.PRODUCT_NOT_FOUND);
}
}
