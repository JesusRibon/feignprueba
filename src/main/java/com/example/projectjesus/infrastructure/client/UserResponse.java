package com.example.projectjesus.infrastructure.client;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserResponse {
  private String nombre;
  private String apellido;
  private String tipo;
  private String documento;

  public UserResponse(String nombre, String apellido , String tipo , String documento){
    this.nombre = nombre;
    this.apellido = apellido;
    this.tipo = tipo;
    this.documento = documento;
  }

}
