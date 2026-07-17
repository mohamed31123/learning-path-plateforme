package com.school.learningpathplateform.mapper;

import com.school.learningpathplateform.dto.UserDto;
import com.school.learningpathplateform.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);
}
