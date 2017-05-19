/**
 * 
 */
package br.com.psc.projetoctb.model.dao;

import javax.persistence.EntityManagerFactory;
import br.com.psc.projetoctb.model.basicas.Pessoa;
import br.com.psc.projetoctb.model.dao.geral.DAOGenerico;

/**
 * @author Jeferson
 *
 */
public class PessoaDAO extends DAOGenerico<Pessoa>{

	public PessoaDAO(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}
}
