package com.example.projectjesus.infrastructure.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "client-1", url = "localhost:8081")
public interface UserClient {

@GetMapping("/user")
  UserResponse getUser(@RequestParam String documento);



}
