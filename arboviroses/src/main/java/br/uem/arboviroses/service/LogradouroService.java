package br.uem.arboviroses.service;

import br.uem.arboviroses.model.Logradouro;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface LogradouroService {
    Logradouro salvar(@Valid @RequestBody Logradouro logradouro);

    List<Logradouro> getAll();

    Logradouro getById(Integer id);

    Logradouro deleteById(Integer id);

}
