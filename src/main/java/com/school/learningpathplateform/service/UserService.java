package com.school.learningpathplateform.service;

import com.school.learningpathplateform.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    UserDto create(UserDto dto);

    List<UserDto> findAll();

    UserDto findById(Long id);

    void delete(Long id);
}
