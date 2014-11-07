package br.com.codigofante.cantada.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.codigofante.cantada.dao.UsuarioDao;
import br.com.codigofante.cantada.modelo.Usuario;


@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@RequestMapping("cadastra")
	public String olaMundo(Usuario usuario){
		usuarioDao.adiciona(usuario);
		return "ok";
	}
}
