/**
 * 
 */
package br.com.psc.projetoctb.model.dao;

import javax.persistence.EntityManagerFactory;

import br.com.psc.projetoctb.model.basicas.VeiculoModelo;
import br.com.psc.projetoctb.model.dao.geral.DAOGenerico;

/**
 * @author Jeferson
 *
 */
public class VeiculoModeloDAO extends DAOGenerico<VeiculoModelo> {

	public VeiculoModeloDAO(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

}
