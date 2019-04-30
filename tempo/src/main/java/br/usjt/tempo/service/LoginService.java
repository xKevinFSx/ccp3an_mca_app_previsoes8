package br.usjt.tempo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.tempo.model.Usuario;
import br.usjt.tempo.repository.UsuarioRepository;

@Service
public class LoginService {
	@Autowired
	private UsuarioRepository usuarioRepo;

	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}