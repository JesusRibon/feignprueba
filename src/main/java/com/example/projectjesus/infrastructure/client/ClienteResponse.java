package com.example.projectjesus.infrastructure.client;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ClienteResponse {

  private String idcliente;
  private String nombre;
  private String apellido;
  private boolean estado;

  public ClienteResponse(String idcliente , String nombre , String apellido , boolean estado){
    this.idcliente = idcliente;
    this.nombre = nombre;
    this.apellido = apellido;
    this.estado = estado;
  }

}
