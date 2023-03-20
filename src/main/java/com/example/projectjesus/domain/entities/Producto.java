package com.example.projectjesus.domain.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Producto {
  private String nombreproducto;
  @Id
  private String idproducto;
  private int cantidad;
  private double precio;




}
