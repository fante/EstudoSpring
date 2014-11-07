package br.com.codigofante.cantada.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.codigofante.cantada.modelo.Usuario;

@Service
public class JPAUsuarioDao implements  UsuarioDao {
	
	@PersistenceContext
	EntityManager manager;

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
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		manager.close();
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
