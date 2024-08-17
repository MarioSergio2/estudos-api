package com.example.estudos.service;

import com.example.estudos.model.Curso;
import com.example.estudos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }

    public Optional<Curso> buscarCursoPorId(Long id){
        return cursoRepository.findById(id);
    }

    public Curso salvarCurso(Curso curso){
        return cursoRepository.save(curso);
    }

    public void deletarCurso(Long id){
        cursoRepository.deleteById(id);
    }
}
