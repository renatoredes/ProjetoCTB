package br.com.psc.projetoctb.model.dao;

import javax.persistence.EntityManagerFactory;

import br.com.psc.projetoctb.model.basicas.FuncionarioMotorista;
import br.com.psc.projetoctb.model.dao.geral.DAOGenerico;

public class FuncionarioMotoristaDAO extends DAOGenerico<FuncionarioMotorista>  {
	
	public FuncionarioMotoristaDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
