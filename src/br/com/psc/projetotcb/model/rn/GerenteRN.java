package br.com.psc.projetotcb.model.rn;

import br.com.psc.projetoctb.model.basicas.Gerente;
import br.com.psc.projetoctb.model.dao.GerenteDAO;
import br.com.psc.projetoctb.model.dao.geral.DAOFactory;

public class GerenteRN {
	
	private final GerenteDAO gd;
	
	public GerenteRN(){
		gd = DAOFactory.getGerenteDAO();
	}
	
	/**
	 * @param com o objeto gerente
	 * 
	 */
	
	public void inserirNovo(Gerente g) throws Exception{
		validaPreenchimento(g);
		gd.insert(g);		
	}

	//Funções internas
	
	private void validaPreenchimento(Gerente g) throws Exception {
		if (g.getNome().equals(null))
			throw new Exception("Nome nao pode ser nulo");
		if (g.getCpf().equals(null))
			throw new Exception("CPF nao pode ser nulo");
	}	
}
