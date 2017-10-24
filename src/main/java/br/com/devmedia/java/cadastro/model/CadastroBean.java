package br.com.devmedia.java.cadastro.model;

import br.com.devmedia.java.cadastro.model.entities.Cadastro;
import br.com.devmedia.java.cadastro.model.entities.Estado;
import br.com.devmedia.java.cadastro.model.entities.EstadoCivil;
import br.com.devmedia.java.cadastro.model.entities.Sexo;
import br.com.devmedia.java.cadastro.service.CadastroService;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroBean {

    private Cadastro cadastro = new Cadastro();
    private CadastroService cadastroService = new CadastroService();

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Estado[] getEstado() {
        return Estado.values();
    }

    public EstadoCivil[] getEstadoCivil() {
        return EstadoCivil.values();
    }

    public Sexo[] getSexo() {
        return Sexo.values();
    }

    public String cadastrar() {
        cadastroService.save(cadastro);
        cadastro = new Cadastro();

        return "sucesso";
    }
}
