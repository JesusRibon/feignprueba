package com.example.projectjesus.infrastructure.adapter;

import com.example.projectjesus.domain.service.ProductoDeleteService;
import com.example.projectjesus.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoDeleteAdapater implements ProductoDeleteService {
  private final ProductoRepository productoRepository;

  @Override
  public void deleteProducto(String idproducto) {
    productoRepository.deleteById(idproducto);

  }
}
