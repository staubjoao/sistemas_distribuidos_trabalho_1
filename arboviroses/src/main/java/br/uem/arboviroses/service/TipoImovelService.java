package br.uem.arboviroses.service;

import br.uem.arboviroses.model.TipoImovel;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface TipoImovelService {

    TipoImovel salvar(@Valid @RequestBody TipoImovel tipoImovel);

    List<TipoImovel> getlAll();

    TipoImovel getById(Integer id);

    TipoImovel deleteById(Integer id);
}
