package com.school.learningpathplateform.repositories;

import com.school.learningpathplateform.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository  extends JpaRepository<Course,Long> {
}
