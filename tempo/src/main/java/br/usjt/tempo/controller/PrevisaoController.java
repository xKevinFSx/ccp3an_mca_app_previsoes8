package br.usjt.tempo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.tempo.model.Previsao;
import br.usjt.tempo.service.PrevisaoService;

@Controller
public class PrevisaoController {

	@Autowired
	private PrevisaoService service;

	@GetMapping("/previsoes")
	public ModelAndView listarPeriodos() throws IOException {
		System.out.println("Entrando em /previsoes");
		ModelAndView modelAndView = new ModelAndView("lista_periodos");
		List<Previsao> previsoes = service.findAll();
		modelAndView.addObject("previsoes", previsoes);
		return modelAndView;
	}
}
