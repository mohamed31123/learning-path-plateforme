package com.school.learningpathplateform.mapper;

import com.school.learningpathplateform.dto.LearningPathDto;
import com.school.learningpathplateform.entities.LearningPath;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "spring")
public interface LearningPathMapper {

    @Mapping(source = "creator.id",
            target = "creatorId")
    LearningPathDto toDto(LearningPath path);
}
