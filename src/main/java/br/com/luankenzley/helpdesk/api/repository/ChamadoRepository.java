package br.com.luankenzley.helpdesk.api.repository;

import br.com.luankenzley.helpdesk.api.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}
