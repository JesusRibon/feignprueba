package com.example.projectjesus.infrastructure.mapper;



import com.example.projectjesus.domain.entities.Cliente;
import com.example.projectjesus.infrastructure.client.ClienteResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface UserMapper {
 Cliente toClienteEntity(ClienteResponse clienteResponse);

 ClienteResponse toClienteResponse(Cliente cliente);



}
