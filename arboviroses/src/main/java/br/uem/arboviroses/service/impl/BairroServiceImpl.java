package br.uem.arboviroses.service.impl;

import br.uem.arboviroses.model.Bairro;
import br.uem.arboviroses.repository.BairroRepository;
import br.uem.arboviroses.service.BairroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BairroServiceImpl implements BairroService {

    @Autowired
    private BairroRepository repository;

    @Override
    public Bairro salvar(Bairro bairro) {
        return null;
    }

    @Override
    public List<Bairro> getlAll() {
        return null;
    }

    @Override
    public Bairro getById(Integer id) {
        return null;
    }

    @Override
    public Bairro deleteById(Integer id) {
        return null;
    }
}
