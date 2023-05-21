package br.com.luankenzley.helpdesk.api.domain.DTO;

import br.com.luankenzley.helpdesk.api.domain.Chamado;
import br.com.luankenzley.helpdesk.api.domain.Cliente;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClienteDTO implements Serializable {

    @JsonIgnore
    private List<Chamado> chamados = new ArrayList<>();

    public ClienteDTO() {
    }

    public ClienteDTO(Cliente obj) {
        this.chamados = obj.getChamados();
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
