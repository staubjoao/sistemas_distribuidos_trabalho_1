package br.uem.arboviroses.service.impl;

import br.uem.arboviroses.model.Quarteirao;
import br.uem.arboviroses.repository.QuarteiraoRepository;
import br.uem.arboviroses.service.QuarteiraoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuarteiraoServiceImpl implements QuarteiraoService {

    @Autowired
    QuarteiraoRepository repository;

    @Override
    public Quarteirao salvar(Quarteirao quarteirao) {
        return repository.save(quarteirao);
    }

    @Override
    public List<Quarteirao> getAll() {
        return repository.findAll();
    }

    @Override
    public Quarteirao getById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public Quarteirao deleteById(Integer id) {
        Quarteirao quarteirao = repository.getById(id);
        repository.delete(quarteirao);
        return quarteirao;
    }

}