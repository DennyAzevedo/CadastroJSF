package br.com.devmedia.java.cadastro.service;

import br.com.devmedia.java.cadastro.model.dao.CadastroDao;
import br.com.devmedia.java.cadastro.model.entities.Cadastro;

public class CadastroService {

    private CadastroDao dao = new CadastroDao();

    public void save(Cadastro cadastro) {
        dao.insert(cadastro);
    }
}
