package br.com.samu.forumhub.repository;

import br.com.samu.forumhub.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
