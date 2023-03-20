package com.example.projectjesus.infrastructure.adapter;

import com.example.projectjesus.domain.entities.Producto;
import com.example.projectjesus.domain.service.ProdcutoSaveService;
import com.example.projectjesus.domain.service.ProductoGetService;
import com.example.projectjesus.infrastructure.dto.ProductoDto;
import com.example.projectjesus.infrastructure.mapper.ProductoMapper;
import com.example.projectjesus.repository.ProductoRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoGetAdapter implements ProductoGetService {
private final ProductoRepository productoRepository;
private final ProductoMapper productoMapper;
  @Override
  public Producto getProdcuto(String idproducto) {
    Optional<ProductoDto>  productoDto = productoRepository.findById(idproducto);
    return productoDto.map(this::buildProducto).orElse(null);
  }

  @Override
  public List<Producto> getListProducto() {
    List<ProductoDto>  productosDto = productoRepository.findAll();
    return productosDto.stream().map(productoMapper::toProductoEntity).toList();
  }
  
  private Producto buildProducto(ProductoDto producto){
    return new Producto(producto.getNombreproducto(),producto.getIdproducto(),producto.getCantidad(),producto.getPrecio());

  }
}
