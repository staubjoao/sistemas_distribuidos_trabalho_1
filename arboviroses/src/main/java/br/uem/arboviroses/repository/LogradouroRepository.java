package br.uem.arboviroses.repository;


import br.uem.arboviroses.model.Logradouro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogradouroRepository extends JpaRepository<Logradouro, Integer> {
}
