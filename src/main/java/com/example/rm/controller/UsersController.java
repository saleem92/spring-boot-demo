package com.example.rm.controller;

import com.example.rm.dto.UserDto;
import com.example.rm.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UsersController {

    private final UserServiceImpl userService;

    @GetMapping
    public List<UserDto> get() {
        return userService.getUsers();
    }

    @PostMapping
    public UUID create(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }
}
