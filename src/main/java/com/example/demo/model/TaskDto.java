package com.example.demo.model;

import java.time.LocalDate;

public record TaskDto(
        Long id,
        String name,
        String description,
        LocalDate dueDate,
        Boolean completed
) {
}