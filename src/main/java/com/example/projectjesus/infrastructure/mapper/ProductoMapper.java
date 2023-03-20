package com.example.projectjesus.infrastructure.mapper;

import com.example.projectjesus.domain.entities.Producto;
import com.example.projectjesus.infrastructure.dto.ProductoDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductoMapper {

  ProductoDto toProductoDto(Producto producto);
  Producto toProductoEntity(ProductoDto productoDto);




}
