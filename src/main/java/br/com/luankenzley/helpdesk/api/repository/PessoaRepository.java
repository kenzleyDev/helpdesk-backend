package br.com.luankenzley.helpdesk.api.repository;

import br.com.luankenzley.helpdesk.api.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
