package com.example.projectjesus.infrastructure.api.controller;

import com.example.projectjesus.application.ProductoDelete;
import com.example.projectjesus.application.ProductoGet;
import com.example.projectjesus.application.ProductoSave;
import com.example.projectjesus.application.ProductoUpdate;
import com.example.projectjesus.domain.entities.Producto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping(path = "/producto")
public class ProductoController {
  private  final ProductoSave productoSave;

  private final ProductoGet productoGet;
  private final ProductoUpdate productoUpdate;
  private final ProductoDelete productoDelete;

  @PostMapping
public ResponseEntity<Producto> saveProducto(@RequestBody Producto producto){
    return new ResponseEntity<>(productoSave.saveProducto(producto) , HttpStatus.CREATED);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<Producto>> getAllProducto(){
    return ResponseEntity.ok(productoGet.getListProducto());
  }

  @GetMapping
  public ResponseEntity<Producto> getProducto(@RequestParam String idproducto){
    return ResponseEntity.ok(productoGet.getProducto(idproducto));
  }

  @PutMapping
  public void updateProducto(@RequestBody Producto producto){
    productoUpdate.updateProducto(producto);
  }

  @DeleteMapping("/idproducto/{idproducto}")
  public void deleteProducto(@RequestParam String idproducto , Producto producto){
    productoDelete.deleteProducto(idproducto , producto);
  }





}
