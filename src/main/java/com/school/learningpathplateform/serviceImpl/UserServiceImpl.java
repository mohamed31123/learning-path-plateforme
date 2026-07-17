package com.school.learningpathplateform.serviceImpl;

import com.school.learningpathplateform.dto.UserDto;
import com.school.learningpathplateform.entities.User;
import com.school.learningpathplateform.mapper.UserMapper;
import com.school.learningpathplateform.repositories.UserRepository;
import com.school.learningpathplateform.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDto create(UserDto dto) {

        User user = mapper.toEntity(dto);

        return mapper.toDto(
                repository.save(user)
        );
    }

    @Override
    public List<UserDto> findAll() {

        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public UserDto findById(Long id) {

        return mapper.toDto(
                repository.findById(id)
                        .orElseThrow()
        );
    }

    @Override
    public void delete(Long id) {

        repository.deleteById(id);
    }
}
