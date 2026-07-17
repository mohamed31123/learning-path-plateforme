package com.school.learningpathplateform.repositories;

import com.school.learningpathplateform.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
