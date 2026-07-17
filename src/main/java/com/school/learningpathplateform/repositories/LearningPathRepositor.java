package com.school.learningpathplateform.repositories;

import com.school.learningpathplateform.entities.LearningPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LearningPathRepositor  extends JpaRepository<LearningPath,Long> {
}
