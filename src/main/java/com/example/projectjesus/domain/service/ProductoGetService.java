package com.example.projectjesus.domain.service;

import com.example.projectjesus.domain.entities.Producto;
import java.util.List;

public interface ProductoGetService {
  Producto getProdcuto(String idproducto);
  List<Producto> getListProducto();

}
