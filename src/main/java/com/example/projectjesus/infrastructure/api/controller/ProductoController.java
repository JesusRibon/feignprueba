package com.example.projectjesus.infrastructure.api.controller;

import com.example.projectjesus.application.ProductoSave;
import com.example.projectjesus.domain.entities.Producto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/producto")
public class ProductoController {
  private  final ProductoSave productoSave;




  @PostMapping
public ResponseEntity<Producto> saveProducto(@RequestBody Producto producto){
return new ResponseEntity<>(productoSave.saveProducto(producto), HttpStatus.CREATED);
  }





}
