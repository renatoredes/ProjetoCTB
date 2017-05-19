/**
 * 
 */
package br.com.psc.projetoctb.model.dao;

import br.com.psc.projetoctb.model.dao.geral.DAOGenerico;

import javax.persistence.EntityManagerFactory;

import br.com.psc.projetoctb.model.basicas.SolicitacaoAbastecimento;

/**
 * @author Jeferson
 *
 */
public class SolicitacaoAbastecimentoDAO extends DAOGenerico<SolicitacaoAbastecimento> {

	public SolicitacaoAbastecimentoDAO(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

}
