package com.example.rm.mapper;

import com.example.rm.dto.UserDto;
import com.example.rm.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto userToDto(User user);

    User dtoToUser(UserDto dto);

    List<UserDto> usersToDtos(List<User> user);
}
