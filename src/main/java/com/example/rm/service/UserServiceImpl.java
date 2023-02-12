package com.example.rm.service;

import com.example.rm.dto.UserDto;
import com.example.rm.entity.User;
import com.example.rm.mapper.UserMapper;
import com.example.rm.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public List<UserDto> getUsers() {
        return userMapper.usersToDtos(userRepository.findAll());
    }

    public UUID createUser(UserDto userDto) {
        User user = userMapper.dtoToUser(userDto);
        userRepository.save(user);

        return user.getId();
    }
}
