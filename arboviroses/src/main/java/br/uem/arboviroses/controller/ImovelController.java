package br.uem.arboviroses.controller;

import br.uem.arboviroses.model.*;
import br.uem.arboviroses.repository.BairroRepository;
import br.uem.arboviroses.service.TipoImovelService;
import br.uem.arboviroses.service.impl.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/imovel")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ImovelController {

    @Autowired
    private ImovelServiceImpl service;

    @Autowired
    private BairroServiceImpl serviceBairro;

    @Autowired
    private LogradouroServiceImpl serviceLogradouro;

    @Autowired
    private QuarteiraoServiceImpl serviceQuarteirao;

    @Autowired
    private TipoImovelServiceImpl serviceTipoImovel;

    @Autowired
    private MunicipioServiceImpl serviceMunicipio;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Imovel post(@RequestBody Imovel imovelDTO) {
        Bairro bairro = imovelDTO.getBairro();
        Municipio municipio = imovelDTO.getBairro().getMunicipio();
        Logradouro logradouro = imovelDTO.getLogradouro();
        Quarteirao quarteirao = imovelDTO.getQuarteirao();
        TipoImovel tipoImovel = imovelDTO.getTipoImovel();

        serviceMunicipio.salvar(municipio);
        serviceBairro.salvar(bairro);
        serviceLogradouro.salvar(logradouro);
        serviceQuarteirao.salvar(quarteirao);
        serviceTipoImovel.salvar(tipoImovel);

        Imovel imovel = new Imovel();

        imovel.setId(imovelDTO.getId());
        imovel.setNumero(imovelDTO.getNumero());
        imovel.setComplemento(imovelDTO.getComplemento());
        imovel.setLatitude("Teste");
        imovel.setLongitude("Teste2");
        imovel.setBairro(imovelDTO.getBairro());
        imovel.setLogradouro(imovelDTO.getLogradouro());
        imovel.setQuarteirao(imovelDTO.getQuarteirao());
        imovel.setTipoImovel(imovelDTO.getTipoImovel());

        return service.salvar(imovel);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    private List<Imovel> getAll() {
        return service.getlAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    private Imovel getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Imovel put(@Valid @RequestBody Imovel imovel) {
        return service.salvar(imovel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Imovel delete(@PathVariable Integer id) {
        return service.deleteById(id);
    }

}
