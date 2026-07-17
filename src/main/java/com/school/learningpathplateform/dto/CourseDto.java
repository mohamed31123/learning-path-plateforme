package com.school.learningpathplateform.dto;

public record CourseDto(
        Long id,
        String title,
        int duration,
        Long learningPathId
) {}
