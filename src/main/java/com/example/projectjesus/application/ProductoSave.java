package com.example.projectjesus.application;

import com.example.projectjesus.domain.entities.Producto;
import com.example.projectjesus.domain.service.ProdcutoSaveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class ProductoSave {
private final ProdcutoSaveService prodcutoSaveService;


public Producto saveProducto(Producto producto){
return prodcutoSaveService.save(producto);
}

}
