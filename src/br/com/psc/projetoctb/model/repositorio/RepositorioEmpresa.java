/**
 * 
 */
package br.com.psc.projetoctb.model.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.psc.projetoctb.model.basicas.Empresa;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira
 *
 */
public class RepositorioEmpresa implements IRepositorioEmpresa {

	private EntityManager em;
		
	public RepositorioEmpresa(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ctb");
		em = emf.createEntityManager();
	}
	@Override
	public void inserirEmpresa(Empresa empresa) {
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			em.persist(empresa);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	@Override
	public void removerEmpresa(Empresa empresa) {
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			em.remove(empresa);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	@Override
	public void alterarALuno(Empresa empresa) {
			EntityTransaction tx = em.getTransaction();
			
			try {
				tx.begin();
				em.merge(empresa);
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
			}
	}

	@Override
	public Empresa consultarporId(Integer id) {
		return em.find(Empresa.class, id);
	}

}
