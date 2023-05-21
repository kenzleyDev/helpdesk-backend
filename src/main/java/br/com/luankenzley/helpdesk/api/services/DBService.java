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

        Tecnico tec1 = new Tecnico(null,"Valdir Cesar", "71487447094", "valdircesar@mail.com", "123");
        tec1.addPerfis(Perfil.ADMIN);
        Tecnico tec2 = new Tecnico(null, "Maria Silva", "72753206066", "mariasilva@mail.com", "456");
        Tecnico tec3 = new Tecnico(null, "João Pereira", "39937608082", "joaopereira@mail.com", "789");
        Tecnico tec4 = new Tecnico(null, "Pedro Oliveira", "88134590098", "pedrooliveira@mail.com", "abc");
        Tecnico tec5 = new Tecnico(null, "Carla Santos", "83642784011", "carlasantos@mail.com", "def");
        Tecnico tec6 = new Tecnico(null, "Lucas Souza", "43373687012", "lucassouza@mail.com", "ghi");

        Cliente cli1 = new Cliente(null, "Linus Torvald", "07634944025", "torvalds@mail.com", "123");
        Cliente cli2 = new Cliente(null, "Steve Jobs", "58788031004", "stevejobs@mail.com", "456");
        Cliente cli3 = new Cliente(null, "Bill Gates", "74503674080", "billgates@mail.com", "789");
        Cliente cli4 = new Cliente(null, "Mark Zuckerberg", "84872958004", "markzuckerberg@mail.com", "abc");
        Cliente cli5 = new Cliente(null, "Elon Musk", "48406000074", "elonmusk@mail.com", "def");
        Cliente cli6 = new Cliente(null, "Jeff Bezos", "16360385066", "jeffbezos@mail.com", "ghi");


        Chamado chamado1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
        Chamado chamado2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 02", "Segundo Chamado", tec2, cli2);
        Chamado chamado3 = new Chamado(null, Prioridade.BAIXA, Status.ANDAMENTO, "Chamado 03", "Terceiro Chamado", tec3, cli3);
        Chamado chamado4 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 04", "Quarto Chamado", tec4, cli4);
        Chamado chamado5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 05", "Quinto Chamado", tec5, cli5);
        Chamado chamado6 = new Chamado(null, Prioridade.BAIXA, Status.ANDAMENTO, "Chamado 06", "Sexto Chamado", tec6, cli6);


        chamadoRepository.saveAll(Arrays.asList(chamado1,chamado2,chamado3,chamado4,chamado5,chamado6));
        clienteRepository.saveAll(Arrays.asList(cli1,cli2,cli3,cli4,cli5,cli6));
        tecnicoRepository.saveAll(Arrays.asList(tec1,tec2,tec3,tec4,tec5,tec6));
    }
}
