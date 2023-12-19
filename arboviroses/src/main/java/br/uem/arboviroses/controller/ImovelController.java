package br.uem.arboviroses.controller;

import br.uem.arboviroses.model.*;
import br.uem.arboviroses.service.impl.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/imovel")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ImovelController {

    @Autowired
    private ImovelServiceImpl service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Imovel post(@RequestBody Imovel imovelDTO) {
        String urlGeolocalizacao = "http://localhost:8081/api/geolocalizacao";

        Imovel imovel = new Imovel();

        imovel.setId(imovelDTO.getId());
        imovel.setNumero(imovelDTO.getNumero());
        imovel.setComplemento(imovelDTO.getComplemento());
        imovel.setBairro(imovelDTO.getBairro());
        imovel.setLogradouro(imovelDTO.getLogradouro());
        imovel.setTipoImovel(imovelDTO.getTipoImovel());
        imovel.setMunicipio(imovelDTO.getMunicipio());
        imovel.setLocalidade(imovelDTO.getLocalidade());

        String query = getString(imovel);

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(urlGeolocalizacao)
                .queryParam("query", query);

        RestTemplate restTemplate = new RestTemplate();
        Geolocalizacao response = restTemplate.getForObject(builder.toUriString(), Geolocalizacao.class);

        imovel.setLatitude(response.getLatitude());
        imovel.setLongitude(response.getLongitude());

        return service.salvar(imovel);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    private List<Imovel> getAll() {
        return service.getlAll();
    }

    @NotNull
    private static String getString(Imovel imovel) {
        String logradouro = imovel.getLogradouro().toLowerCase();
        String numero = imovel.getNumero();
        String cidade = imovel.getMunicipio().toLowerCase();

        return logradouro.replace(" ", "+") +
                "+" +
                numero +
                "+" +
                cidade.replace(" ", "+") +
                "+" +
                "paraná";
    }

}
