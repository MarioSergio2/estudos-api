package com.example.estudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.estudos.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
