package br.com.codigofante.cantada.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.codigofante.cantada.dao.JPAUsuarioDao;
import br.com.codigofante.cantada.modelo.Usuario;


@Controller
public class UsuarioController {
	
	JPAUsuarioDao jpaUsuario;

	@Autowired
	@RequestMapping("cadastra")
	public String olaMundo(Usuario usuario){
		jpaUsuario.adiciona(usuario);
		return "ok";
	}
}
