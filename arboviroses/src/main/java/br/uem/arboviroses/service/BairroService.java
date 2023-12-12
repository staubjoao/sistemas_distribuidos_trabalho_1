package br.uem.arboviroses.service;

import br.uem.arboviroses.model.Bairro;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface BairroService {

    Bairro salvar(@Valid @RequestBody Bairro bairro);

    List<Bairro> getlAll();

    Bairro getById(Integer id);

    Bairro deleteById(Integer id);

}