package com.school.learningpathplateform.mapper;

import com.school.learningpathplateform.dto.CourseDto;
import com.school.learningpathplateform.entities.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    @Mapping(source = "learningPath.id",
            target = "learningPathId")
    CourseDto toDto(Course course);
}
