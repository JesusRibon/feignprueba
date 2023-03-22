package com.example.projectjesus.application;

import com.example.projectjesus.domain.entities.Producto;
import com.example.projectjesus.domain.service.ProdcutoSaveService;
import com.example.projectjesus.domain.service.ProductoGetService;
import com.example.projectjesus.infrastructure.adapter.UserGetAdapter;
import com.example.projectjesus.shared.ProductoExeption;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j

public class ProductoSave {

  private final ProdcutoSaveService prodcutoSaveService;
  private final UserGetAdapter userGetAdapter;
  private final ProductoGetService productoGetService;


  public Producto saveProducto(Producto producto) {
    Producto producto1 = productoGetService.getProdcuto(producto.getIdproducto());

    if (producto1 != null) {
      throw new ProductoExeption("Producto ya existe  " + producto.getIdproducto());
    }else{
      log.info("Producto subido exitosamente");
      return prodcutoSaveService.save(producto1);
    }

  }
}


