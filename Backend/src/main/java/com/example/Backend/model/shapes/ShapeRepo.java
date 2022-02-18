package com.example.Backend.model.shapes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShapeRepo extends JpaRepository<Shape, Long> {
    Shape findByShapeCode(String id); // THE JPA SPRING BOOT WILL CREATE QUERY FOR YOU
    Shape findTopByOrderByIdDesc();
}
