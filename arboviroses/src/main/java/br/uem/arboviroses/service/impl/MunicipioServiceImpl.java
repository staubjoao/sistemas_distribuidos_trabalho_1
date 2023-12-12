package br.uem.arboviroses.service.impl;

import br.uem.arboviroses.model.Municipio;
import br.uem.arboviroses.repository.MunicipioRepository;
import br.uem.arboviroses.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MunicipioServiceImpl implements MunicipioService {

    @Autowired
    private MunicipioRepository repository;

    @Override
    public Municipio salvar(Municipio municipio) {
        Municipio save = repository.save(municipio);
        return save;
    }

    @Override
    public List<Municipio> getlAll() {
        return repository.findAll();
    }

    @Override
    public Municipio getById(Integer id) {
        return getById(id);
    }

    @Override
    public Municipio deleteById(Integer id) {
        Municipio municipio = repository.getById(id);
        repository.delete(municipio);
        return municipio;
    }
}
