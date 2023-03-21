package com.example.projectjesus.infrastructure.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "client-1", url = "localhost:8081")
public interface UserClient {

@GetMapping("/api/user/{documento}")
  UserResponse getUser(@PathVariable("documento") String documento);



}
