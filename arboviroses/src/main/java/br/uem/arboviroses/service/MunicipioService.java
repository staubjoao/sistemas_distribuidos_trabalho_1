package br.uem.arboviroses.service;

import br.uem.arboviroses.model.Municipio;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface MunicipioService {

    Municipio salvar(@Valid @RequestBody Municipio municipio);

    List<Municipio> getlAll();

    Municipio getById(Integer id);

    Municipio deleteById(Integer id);

}