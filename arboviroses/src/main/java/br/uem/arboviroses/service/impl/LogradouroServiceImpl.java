package br.uem.arboviroses.service.impl;

import br.uem.arboviroses.model.Logradouro;
import br.uem.arboviroses.repository.LogradouroRepository;
import br.uem.arboviroses.service.LogradouroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LogradouroServiceImpl implements LogradouroService {

    @Autowired
    private LogradouroRepository repository;

    @Override
    public Logradouro salvar(Logradouro logradouro) {
        return repository.save(logradouro);
    }

    @Override
    public List<Logradouro> getAll() {
        return repository.findAll();
    }

    @Override
    public Logradouro getById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public Logradouro deleteById(Integer id) {
        Logradouro logradouro = repository.getById(id);
        repository.delete(logradouro);
        return logradouro;
    }
}
