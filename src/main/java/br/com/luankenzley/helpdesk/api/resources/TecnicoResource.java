package br.com.luankenzley.helpdesk.api.resources;

import br.com.luankenzley.helpdesk.api.domain.DTO.TecnicoDTO;
import br.com.luankenzley.helpdesk.api.domain.Tecnico;
import br.com.luankenzley.helpdesk.api.services.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tecnicos")
public class TecnicoResource {
    @Autowired
    private TecnicoService tecnicoService;

    @GetMapping("/{id}")
    public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id) {
        Tecnico obj = tecnicoService.findById(id);

        return ResponseEntity.ok().body(new TecnicoDTO(obj));
    }
    @GetMapping
    public ResponseEntity<List<TecnicoDTO>> findAll() {

        List<Tecnico> list = tecnicoService.findAll();
        List<TecnicoDTO> listDTO = list.stream().map(obj -> new TecnicoDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);

    }
}
