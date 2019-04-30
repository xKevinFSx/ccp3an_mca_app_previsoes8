package br.usjt.tempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.tempo.model.Previsao;

@Repository
public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {

}
