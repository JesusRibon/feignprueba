package com.example.projectjesus.infrastructure.adapter;


import com.example.projectjesus.domain.entities.User;
import com.example.projectjesus.domain.service.UserGetService;
import com.example.projectjesus.infrastructure.client.UserClient;
import com.example.projectjesus.infrastructure.client.UserResponse;
import com.example.projectjesus.infrastructure.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserGetAdapter implements UserGetService {
  private final UserClient userClient;
  private final UserMapper userMapper;


  @Override
  public User getUser(String documento) {

    User user =userMapper.toUserEntity(userClient.getUser(documento));
    user.toString();
    return user;
  }

}
