package com.example.projectjesus.domain.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class  Cliente{
  @Id
  private String idcliente;
  private String nombre;
  private String apellido;

  private boolean estado;


}
