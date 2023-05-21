package br.com.luankenzley.helpdesk.api.services;

import br.com.luankenzley.helpdesk.api.domain.DTO.TecnicoDTO;
import br.com.luankenzley.helpdesk.api.domain.Tecnico;
import br.com.luankenzley.helpdesk.api.repository.TecnicoRepository;
import br.com.luankenzley.helpdesk.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    public Tecnico findById(Integer id) {
        Optional<Tecnico> tecnicoById = tecnicoRepository.findById(id);
        return tecnicoById.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: " + id));
    }

    public List<Tecnico> findAll() {
        return tecnicoRepository.findAll();
    }

    public Tecnico create(TecnicoDTO tecnicoDTO) {
        tecnicoDTO.setId(null);
        Tecnico newObj = new Tecnico(tecnicoDTO);
        return tecnicoRepository.save(newObj);
    }
}
