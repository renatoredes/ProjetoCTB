/**
 * 
 */
package br.com.psc.projetotcb.model.rn;

import br.com.psc.projetoctb.model.basicas.FuncionarioMotorista;
import br.com.psc.projetoctb.model.dao.FuncionarioMotoristaDAO;
import br.com.psc.projetoctb.model.dao.geral.DAOFactory;

/**
 * @author Jeferson
 *
 */
public class FuncionarioMotoristaRN {
	private FuncionarioMotoristaDAO fmd;
	
	public FuncionarioMotoristaRN(){
		fmd = DAOFactory.getFuncionarioMotoristaDAO();
	}
	
    public void inserirNovo(FuncionarioMotorista fm)throws Exception {
    	validaPreenchimento(fm);
        fmd.insert(fm);
    }   
    
	private void validaPreenchimento(FuncionarioMotorista objeto) throws Exception {
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
