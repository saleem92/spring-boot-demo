package com.example.rm.service;

import com.example.rm.dto.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<UserDto> getUsers();

    UUID createUser(UserDto userDto);
}
