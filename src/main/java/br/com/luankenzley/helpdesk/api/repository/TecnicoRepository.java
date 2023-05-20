package br.com.luankenzley.helpdesk.api.repository;

import br.com.luankenzley.helpdesk.api.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
