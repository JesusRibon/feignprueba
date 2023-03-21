package com.example.projectjesus.infrastructure.mapper;



import com.example.projectjesus.domain.entities.User;
import com.example.projectjesus.infrastructure.client.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface UserMapper {
 User toUserEntity(UserResponse userResponse);

 UserResponse toUserResponse(User user);



}
