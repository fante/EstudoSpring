package br.com.codigofante.cantada.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.codigofante.cantada.modelo.Usuario;

@Repository
public class JPAUsuarioDao implements  UsuarioDao {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Usuario buscaPorId(int id) {
		
		return null;
	}

	@Override
	public List<Usuario> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void adiciona(Usuario usuario) {
		System.out.println(manager);
		System.out.println(usuario.getEmailUsuario());
		manager.persist(usuario);
	}

	@Override
	public void altera(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
