/**
 * 
 */
package br.com.psc.projetoctb.model.dao;
import javax.persistence.EntityManagerFactory;

import br.com.psc.projetoctb.model.basicas.Veiculo;
import br.com.psc.projetoctb.model.dao.geral.DAOGenerico;
/**
 * @author Jeferson
 *
 */
public class VeiculoDAO extends DAOGenerico<Veiculo>{

	public VeiculoDAO(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

}
