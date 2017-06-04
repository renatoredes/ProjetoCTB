/**
 * 
 */
package br.com.psc.projetoctb.model.dao;

import javax.persistence.EntityManagerFactory;

import br.com.psc.projetoctb.model.basicas.Gerente;
import br.com.psc.projetoctb.model.dao.geral.DAOGenerico;

/**
 * @author Jeferson
 *
 */
public class GerenteDAO extends DAOGenerico<Gerente> {
	
	public GerenteDAO(EntityManagerFactory emf) {
		super(emf);
	}
}
