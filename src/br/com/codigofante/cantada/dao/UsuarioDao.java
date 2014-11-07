package br.com.codigofante.cantada.dao;

import java.util.List;

import br.com.codigofante.cantada.modelo.Usuario;

public interface UsuarioDao {
	
	Usuario buscaPorId(int id);
	List<Usuario> lista();
	void adiciona(Usuario usuario);
	void altera(Usuario usuario);
	void remove(Usuario usuario);
	
}
