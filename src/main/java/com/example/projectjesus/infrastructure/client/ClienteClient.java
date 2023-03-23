package com.example.projectjesus.infrastructure.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "client-1", url = "localhost:8080")
public interface ClienteClient {

@GetMapping("/cliente")
ClienteResponse getCliente(@RequestParam String idcliente);



}
