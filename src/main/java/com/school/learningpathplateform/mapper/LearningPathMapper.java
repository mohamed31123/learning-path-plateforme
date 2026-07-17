package com.school.learningpathplateform.mapper;

import com.school.learningpathplateform.dto.LearningPathDto;
import com.school.learningpathplateform.entities.LearningPath;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LearningPathMapper {

    @Mapping(source = "creator.id",
            target = "creatorId")
    LearningPathDto toDto(LearningPath path);
}
