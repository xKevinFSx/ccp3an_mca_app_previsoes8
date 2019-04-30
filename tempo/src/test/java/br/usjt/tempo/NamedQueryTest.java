package br.usjt.tempo;

import org.junit.Test;

import br.usjt.tempo.model.Cidade;
import br.usjt.tempo.repository.CidadeRepository;

public class NamedQueryTest {

	private CidadeRepository cidadeRepo;
	
	@Test
	public void testBuscaNamedQuery() {
		Cidade c = cidadeRepo.buscaLatELong("latitude", "longitude");
		System.out.println(c);
	}
	
}