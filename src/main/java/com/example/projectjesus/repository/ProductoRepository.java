package com.example.projectjesus.repository;

import com.example.projectjesus.infrastructure.dto.ProductoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoDto, String> {

}
