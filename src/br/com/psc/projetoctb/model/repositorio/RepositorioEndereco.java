package br.com.psc.projetoctb.model.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.psc.projetoctb.model.basicas.Endereco;

public class RepositorioEndereco implements IRepositorioEndereco {

	private EntityManager em;
	
	public RepositorioEndereco(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ctb");
		em = emf.createEntityManager();
	}
	@Override
	public void inserirEndereco(Endereco endereco) {
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			em.persist(endereco);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	@Override
	public void removerEndereco(Endereco endereco) {
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			em.remove(endereco);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	@Override
	public void alterarEndereco(Endereco endereco) {
			EntityTransaction tx = em.getTransaction();
			
			try {
				tx.begin();
				em.merge(endereco);
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
			}
	}

	@Override
	public Endereco consultarporId(Integer id) {
		return em.find(Endereco.class, id);
	}

}


