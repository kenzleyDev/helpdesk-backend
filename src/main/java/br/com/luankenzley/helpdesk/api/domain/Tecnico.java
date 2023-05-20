package br.com.luankenzley.helpdesk.api.domain;

import br.com.luankenzley.helpdesk.api.domain.enums.Perfil;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Tecnico extends Pessoa {
    @JsonIgnore
    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
        super();
        addPerfis(Perfil.TECNICO);
    }
    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        addPerfis(Perfil.TECNICO);
    }
    public List<Chamado> getChamados() {
        return chamados;
    }
    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
