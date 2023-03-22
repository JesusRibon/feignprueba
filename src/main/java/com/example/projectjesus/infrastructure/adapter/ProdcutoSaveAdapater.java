package com.example.projectjesus.infrastructure.adapter;

import com.example.projectjesus.domain.entities.Producto;
import com.example.projectjesus.domain.service.ProdcutoSaveService;
import com.example.projectjesus.infrastructure.client.UserClient;
import com.example.projectjesus.infrastructure.client.UserResponse;
import com.example.projectjesus.infrastructure.mapper.ProductoMapper;
import com.example.projectjesus.shared.ProductoExeption;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.projectjesus.repository.ProductoRepository;

@AllArgsConstructor
@Service
public class ProdcutoSaveAdapater implements ProdcutoSaveService {
  private final ProductoRepository productoRepository;
  private final ProductoMapper productoMapper;


  @Override
  public Producto save(Producto producto){


    return productoMapper.toProductoEntity(productoRepository.save(productoMapper.toProductoDto(producto)));
  }
}
