package br.uem.arboviroses.repository;

import br.uem.arboviroses.model.Quarteirao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuarteiraoRepository extends JpaRepository<Quarteirao, Integer> {
}
