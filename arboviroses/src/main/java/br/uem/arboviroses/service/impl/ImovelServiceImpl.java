package br.uem.arboviroses.service.impl;

import br.uem.arboviroses.model.Imovel;
import br.uem.arboviroses.repository.ImovelRepository;
import br.uem.arboviroses.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ImovelServiceImpl implements ImovelService {

    @Autowired
    private ImovelRepository repository;

    @Override
    public Imovel salvar(Imovel imovel) {
        Imovel save = repository.save(imovel);
        return save;
    }

    @Override
    public List<Imovel> getlAll() {
        return repository.findAll();
    }

    @Override
    public Imovel getById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public Imovel deleteById(Integer id) {
        Imovel imovel = repository.getById(id);
        repository.delete(repository.getById(id));
        return imovel;
    }
}