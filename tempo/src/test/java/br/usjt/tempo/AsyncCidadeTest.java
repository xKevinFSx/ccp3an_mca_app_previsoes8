package br.usjt.tempo;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.tempo.model.Cidade;
import br.usjt.tempo.repository.CidadeRepository;

public class AsyncCidadeTest {

	@Autowired
	private CidadeRepository cidadeRepo;
	
	@Test
	public void testBuscaAssincrono() throws InterruptedException, ExecutionException {
		Future<List<Cidade>> future = cidadeRepo.findByNome("Cidade");
		System.out.println("");
		System.out.println("");

		List<Cidade> cidades = future.get();
		for (Cidade cidade : cidades) {
			System.out.println(cidade);
		}
	}
	
	/*
	@Test
	public void testQueryExplicita() throws InterruptedException, ExecutionException {
		List<Cidade> cidade1 = cidadeRepo.findByLatAndLong("Latitude", "Longitude");
		cidade1.forEach(System.out::println);
		
		List<Cidade> cidade2 = cidadeRepo.findByNome("Cidade");
		cidade2.forEach(System.out::println);
		
		List<Cidade> cidade3 = cidadeRepo.findByNomeIgnoreCase("CIDADE");
		cidade3.forEach(System.out::println);
		
	}
	*/
	
	/*
	@Test
	public void test () {
	Cidade c = cidadeRepo.findByLatAndLong("latitude", "longitude");
	System.out.println(c);
	}
	*/
	
}
