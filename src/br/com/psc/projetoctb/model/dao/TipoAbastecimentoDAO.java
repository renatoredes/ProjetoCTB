/**
 * 
 */
package br.com.psc.projetoctb.model.dao;

import javax.persistence.EntityManagerFactory;

import br.com.psc.projetoctb.model.basicas.TipoAbastecimento;
import br.com.psc.projetoctb.model.dao.geral.DAOGenerico;
/**
 * @author Jeferson
 *
 */
public class TipoAbastecimentoDAO extends DAOGenerico<TipoAbastecimento> {

	public TipoAbastecimentoDAO(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

}
