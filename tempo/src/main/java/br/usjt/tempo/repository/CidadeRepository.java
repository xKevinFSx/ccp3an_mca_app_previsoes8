package br.usjt.tempo.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import br.usjt.tempo.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	public Cidade buscaLatELong (@Param ("latitude") String latitude, @Param ("longitude") String longitude);
	
	@Async	
	public Future <List<Cidade>> findByLatAndLong (String latitude, String longitude);
	//@Query ("SELECT c FROM Cidade c WHERE c.latitude, c.longitude = ?1")
	//public List<Cidade> findByLatAndLong (String latitude, String longitude);
	
	@Async
	public Future <List<Cidade>> findByNome(String nome);
	//@Query ("SELECT c FROM Cidade c WHERE c.nome = ?1")
	//public List<Cidade> findByNome(String nome);


	@Async
	public Future <List<Cidade>> findByNomeIgnoreCase(String nome);
	//@Query ("SELECT c FROM Cidade c WHERE c.nome = ?1")
	//public List<Cidade> findByNomeIgnoreCase(String nome);

}
