package com.example.projectjesus.infrastructure.adapter;


import com.example.projectjesus.domain.entities.Cliente;
import com.example.projectjesus.domain.service.ClienteGetService;
import com.example.projectjesus.infrastructure.client.ClienteClient;
import com.example.projectjesus.infrastructure.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteGetAdapter implements ClienteGetService {
  private final ClienteClient clienteClient;
  private final UserMapper userMapper;


  @Override
  public Cliente getCliente(String idcliente) {


    Cliente cliente =userMapper.toClienteEntity(clienteClient.getCliente(idcliente));
    cliente.toString();
    return cliente;
  }

}
