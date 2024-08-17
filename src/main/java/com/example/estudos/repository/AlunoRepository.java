package com.example.estudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.estudos.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
