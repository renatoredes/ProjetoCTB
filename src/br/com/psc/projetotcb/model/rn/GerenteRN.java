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
	
		public String validarCpf(Gerente objeto) throws Exception{
			if (objeto.getCpf() == null) {
				 throw new Exception("Cpf não pode ser Nulo");
			}else if (objeto.getCpf().isEmpty()) {
				throw new Exception("Cpf precisa ser preenchido");
			}
			return null;
		}
	
		private void validaPreenchimento(Gerente objeto) throws Exception {
			if (objeto.getNome() == null)
				throw new Exception("Nome nao pode ser nulo");
			if (objeto.getCpf() == null)
				throw new Exception("CPF nao pode ser nulo");
			if (objeto.getCelular() == null)
				throw new Exception("Celular nao pode ser nulo");
			if (objeto.getEstadoCivil() == null)
				throw new Exception("Estado Civil nao pode ser nulo");
			if (objeto.getFuncao() == null)
				throw new Exception("Funcao nao pode ser nulo");
			if (objeto.getIdade() == null)
				throw new Exception("Idade nao pode ser nula");
			if (objeto.getRg() == null)
				throw new Exception("RG não pode ser um nulo");
			if (objeto.getTelefone() == null)
				throw new Exception("Telefone não pode ser nulo");
		}

		
}
