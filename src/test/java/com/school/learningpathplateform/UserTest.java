package com.school.learningpathplateform;

import com.school.learningpathplateform.dto.UserDto;
import com.school.learningpathplateform.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService service;

    @Test
    void shouldCreateUser() {

        UserDto dto =
                new UserDto(
                        null,
                        "Mohamed",
                        "mohamed@gmail.com"
                );

        UserDto result =
                service.create(dto);

        assertNotNull(result.id());
    }
}
