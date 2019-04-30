package br.usjt.tempo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.tempo.model.Cidade;
import br.usjt.tempo.repository.CidadeRepository;

@RunWith (SpringRunner.class)
@SpringBootTest
public class CidadeTest {
	
	@Autowired
	private CidadeRepository cidadeRepo;
	
	@Test
	public void testBuscaCidadesLatELong() {
		Cidade c = (Cidade) cidadeRepo.findByLatAndLong("latitude", "longitude");
	}
	
	@Test
	public void testeBuscaCidadesNome() {
		Cidade c = (Cidade) cidadeRepo.findByNome("Cidade");
	}
	
	@Test
	public void testBuscaCidadeNomeIgnore() {
		List<Cidade> cidade = cidadeRepo.findByNomeIgnoreCase("Cidade".equalsIgnoreCase("CIDADE"));
	}
	
}