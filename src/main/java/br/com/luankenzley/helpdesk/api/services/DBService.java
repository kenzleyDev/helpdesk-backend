package br.com.luankenzley.helpdesk.api.services;

import br.com.luankenzley.helpdesk.api.domain.Chamado;
import br.com.luankenzley.helpdesk.api.domain.Cliente;
import br.com.luankenzley.helpdesk.api.domain.Tecnico;
import br.com.luankenzley.helpdesk.api.domain.enums.Perfil;
import br.com.luankenzley.helpdesk.api.domain.enums.Prioridade;
import br.com.luankenzley.helpdesk.api.domain.enums.Status;
import br.com.luankenzley.helpdesk.api.repository.ChamadoRepository;
import br.com.luankenzley.helpdesk.api.repository.ClienteRepository;
import br.com.luankenzley.helpdesk.api.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private ChamadoRepository chamadoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private TecnicoRepository tecnicoRepository;

    public void instanciaDB() {
        Tecnico tec1 = new Tecnico(null,"Valdir Cesar", "760.457.123-658", "valdircesar@mail.com", "123");
        tec1.addPerfis(Perfil.ADMIN);
        Cliente cli1 = new Cliente(null, "Linus Torvald", "254.458.369-17", "torvalds@mail.com", "123");
        Chamado chamado1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);

        chamadoRepository.saveAll(Arrays.asList(chamado1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        tecnicoRepository.saveAll(Arrays.asList(tec1));
    }
}