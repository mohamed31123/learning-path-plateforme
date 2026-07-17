package com.school.learningpathplateform.controller;

import com.school.learningpathplateform.dto.UserDto;
import com.school.learningpathplateform.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public UserDto create(
            @RequestBody UserDto dto) {

        return service.create(dto);
    }

    @GetMapping
    public List<UserDto> findAll() {

        return service.findAll();
    }

    @GetMapping("/{id}")
    public UserDto findById(
            @PathVariable Long id) {

        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Long id) {

        service.delete(id);
    }
}
