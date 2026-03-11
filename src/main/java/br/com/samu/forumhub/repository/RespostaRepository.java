package br.com.samu.forumhub.repository;

import br.com.samu.forumhub.domain.resposta.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespostaRepository extends JpaRepository<Resposta, Long> {
}
