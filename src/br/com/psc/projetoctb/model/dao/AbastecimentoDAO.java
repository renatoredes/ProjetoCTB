/**
 * 
 */
package br.com.psc.projetoctb.model.dao;

import javax.persistence.EntityManagerFactory;
import br.com.psc.projetoctb.model.basicas.Abastecimento;
import br.com.psc.projetoctb.model.dao.geral.DAOGenerico;
/**
 * @author Jeferson
 *
 */
public class AbastecimentoDAO extends DAOGenerico<Abastecimento> {
	public AbastecimentoDAO(EntityManagerFactory emf) {
		super(emf);
	}
}
