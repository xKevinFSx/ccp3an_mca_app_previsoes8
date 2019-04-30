package br.usjt.tempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.tempo.model.Previsao;
import br.usjt.tempo.repository.PrevisaoRepository;

@Service
public class PrevisaoService {

	@Autowired private PrevisaoRepository repository;

	public List<Previsao> findAll() {
		return repository.findAll();
	}
	
	
	
}
