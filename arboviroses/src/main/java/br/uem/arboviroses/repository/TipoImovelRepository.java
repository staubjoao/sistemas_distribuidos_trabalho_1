package br.uem.arboviroses.repository;

import br.uem.arboviroses.model.TipoImovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoImovelRepository extends JpaRepository<TipoImovel, Integer> {
}
