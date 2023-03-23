package com.example.projectjesus.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ClienteDto {
  @Id
  private String idcliente;
  private String nombre;
  private String apellido;
  private boolean estado;

}
