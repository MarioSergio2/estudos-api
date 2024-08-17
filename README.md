## Diagrama de Classes

```mermaid
classDiagram
    class Curso {
        +Long id
        +String nome
        +String descricao
        +int duracao
    }

    class Aluno {
        +Long id
        +String nome
        +String email
    }

    Curso "1" -- "0..*" Aluno : 
    
    class CursoRepository {
        <<interface>>
        +List<Curso> findAll()
        +Optional<Curso> findById(Long id)
        +Curso save(Curso curso)
        +void deleteById(Long id)
    }

    class AlunoRepository {
        <<interface>>
        +List<Aluno> findAll()
        +Optional<Aluno> findById(Long id)
        +Aluno save(Aluno aluno)
        +void deleteById(Long id)
    }

    class CursoService {
        +List<Curso> listarCursos()
        +Optional<Curso> buscarCursoPorId(Long id)
        +Curso salvarCurso(Curso curso)
        +void deletarCurso(Long id)
    }

    class AlunoService {
        +List<Aluno> listarAlunos()
        +Optional<Aluno> buscarAlunoPorId(Long id)
        +Aluno salvarAluno(Aluno aluno)
        +void deletarAluno(Long id)
    }

    class CursoController {
        +List<Curso> listarCursos()
        +ResponseEntity<Curso> buscarCursoPorId(Long id)
        +Curso salvarCurso(Curso curso)
        +ResponseEntity<Void> deletarCurso(Long id)
    }

    class AlunoController {
        +List<Aluno> listarAlunos()
        +ResponseEntity<Aluno> buscarAlunoPorId(Long id)
        +Aluno salvarAluno(Aluno aluno)
        +ResponseEntity<Void> deletarAluno(Long id)
    }

    CursoRepository <|-- CursoService
    AlunoRepository <|-- AlunoService
    CursoService <|-- CursoController
    AlunoService <|-- AlunoController
