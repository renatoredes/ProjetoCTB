/**
 * 
 */
package br.com.psc.projetoctb.model.dao;

import javax.persistence.EntityManagerFactory;

import br.com.psc.projetoctb.model.basicas.Endereco;
import br.com.psc.projetoctb.model.dao.geral.DAOGenerico;

/**
 * @author Jeferson
 *
 */
public class EnderecoDAO extends DAOGenerico<Endereco>{

	public EnderecoDAO(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}
}
