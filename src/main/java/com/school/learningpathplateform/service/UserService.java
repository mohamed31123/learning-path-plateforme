package com.school.learningpathplateform.service;

import com.school.learningpathplateform.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto create(UserDto dto);

    List<UserDto> findAll();

    UserDto findById(Long id);

    void delete(Long id);
}
