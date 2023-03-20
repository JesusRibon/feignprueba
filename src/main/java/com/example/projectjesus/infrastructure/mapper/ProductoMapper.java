package com.example.projectjesus.infrastructure.mapper;

import com.example.projectjesus.domain.entities.Producto;
import com.example.projectjesus.infrastructure.dto.ProductoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;



@Mapper(componentModel = "spring")
public interface ProductoMapper {

  ProductoDto toProductoDto(Producto producto);
  @Mapping(target = "nombreproducto" , source = "nombreproducto")
  @Mapping(target = "idproducto" , source = "idproducto")
  @Mapping(target = "cantidad" , source = "cantidad")
  @Mapping(target = "precio" , source = "precio")

  Producto toProductoEntity(ProductoDto productoDto);






}
