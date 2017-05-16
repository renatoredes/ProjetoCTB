package br.com.psc.projetoctb.model.regranegocio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.psc.projetoctb.model.basicas.Gerente;
import br.com.psc.projetoctb.model.repositorio.IRepositorioGerente;

public class RepositorioGerente implements IRepositorioGerente {
	
		private EntityManager em;
		
	public RepositorioGerente(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ctb");
		em = emf.createEntityManager();
	}
	@Override
	public void inserirGerente(Gerente gerente) {
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			em.persist(gerente);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	@Override
	public void removerGerente(Gerente gerente) {
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			em.remove(gerente);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	@Override
	public void alterarGerente(Gerente gerente) {
			EntityTransaction tx = em.getTransaction();
			
			try {
				tx.begin();
				em.merge(gerente);
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
			}
	}

	@Override
	public Gerente consultarporId(Integer id) {
		return em.find(Gerente.class, id);
	}
}
