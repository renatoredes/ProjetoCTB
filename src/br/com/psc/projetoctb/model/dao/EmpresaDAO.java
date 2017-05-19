/**
 * 
 */
package br.com.psc.projetoctb.model.dao;

import javax.persistence.EntityManagerFactory;

import br.com.psc.projetoctb.model.basicas.Empresa;
import br.com.psc.projetoctb.model.dao.geral.DAOGenerico;

/**
 * @author Jeferson
 *
 */

public class EmpresaDAO extends DAOGenerico<Empresa>{

	public EmpresaDAO(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

}
