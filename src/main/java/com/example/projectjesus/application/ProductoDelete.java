package com.example.projectjesus.application;

import com.example.projectjesus.domain.service.ProductoDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoDelete {
  private  final ProductoDeleteService productoDeleteService;
  public void deleteProducto(String idproducto){
    productoDeleteService.deleteProducto(idproducto);
  }

}
