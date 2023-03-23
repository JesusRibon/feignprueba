package com.example.projectjesus.application;

import com.example.projectjesus.domain.entities.Producto;
import com.example.projectjesus.domain.service.ProductoDeleteService;
import com.example.projectjesus.domain.service.ProductoGetService;
import com.example.projectjesus.shared.ProductoExeption;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoDelete {
  private  final ProductoDeleteService productoDeleteService;
private final ProductoGetService productoGetService;
  public void deleteProducto(String idproducto , Producto producto){
    Producto producto2 = productoGetService.getProdcuto(producto.getIdproducto());
    if(producto2 !=null){
      productoDeleteService.deleteProducto(idproducto);
      throw new ProductoExeption("Prodcuto elimanado exitosamente ");


    }else{

      throw new ProductoExeption("el producto que desea eliminar no existe " +producto.getIdproducto());

    }




  }

}
