package com.school.learningpathplateform.dto;

public record LearningPathDto(
        Long id,
        String title,
        String description,
        Long creatorId
) {}
