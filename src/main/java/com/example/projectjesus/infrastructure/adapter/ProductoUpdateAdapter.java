package com.example.projectjesus.infrastructure.adapter;

import com.example.projectjesus.domain.entities.Producto;
import com.example.projectjesus.domain.service.ProductoUpdateService;
import com.example.projectjesus.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoUpdateAdapter implements ProductoUpdateService {
  private final ProductoRepository productoRepository;

  @Transactional
  public void updateProducto(Producto producto) {


  }
}
