package br.com.luankenzley.helpdesk.api.repository;

import br.com.luankenzley.helpdesk.api.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
