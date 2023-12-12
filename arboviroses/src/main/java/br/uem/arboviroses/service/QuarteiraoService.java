package br.uem.arboviroses.service;

import br.uem.arboviroses.model.Quarteirao;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface QuarteiraoService {
    Quarteirao salvar(@Valid @RequestBody Quarteirao quarteirao);

    List<Quarteirao> getAll();

    Quarteirao getById(Integer id);

    Quarteirao deleteById(Integer id);

}
