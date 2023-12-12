package br.uem.arboviroses.service.impl;

import br.uem.arboviroses.model.TipoImovel;
import br.uem.arboviroses.repository.TipoImovelRepository;
import br.uem.arboviroses.service.TipoImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TipoImovelServiceImpl implements TipoImovelService {

    @Autowired
    private TipoImovelRepository repository;

    @Override
    public TipoImovel salvar(TipoImovel tipoImovel) {
        return repository.save(tipoImovel);
    }

    @Override
    public List<TipoImovel> getlAll() {
        return repository.findAll();
    }

    @Override
    public TipoImovel getById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public TipoImovel deleteById(Integer id) {
        TipoImovel tipoImovel = repository.getById(id);
        repository.delete(tipoImovel);
        return tipoImovel;
    }
}
