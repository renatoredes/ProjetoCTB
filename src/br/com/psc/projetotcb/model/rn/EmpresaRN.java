/**
 * 
 */
package br.com.psc.projetotcb.model.rn;

import br.com.psc.projetoctb.model.basicas.Empresa;
import br.com.psc.projetoctb.model.dao.EmpresaDAO;
import br.com.psc.projetoctb.model.dao.geral.DAOFactory;

/**
 * @author Jeferson
 *
 */
public class EmpresaRN {
	private EmpresaDAO ed;
	
	public EmpresaRN(){
		ed = DAOFactory.getEmpresaDAO();
	}
	
    public void inserirNovo(Empresa e)throws Exception {
        validaPreenchimento(e);
        ed.insert(e);
    }   
    
    private void validaPreenchimento(Empresa e) throws Exception{
    	if (e.getNomeFantasia() == null ||
    		e.getRazaoSocial() == null ||
    		e.getCnpjEmpresa() == null)
    		throw new Exception("cnpj, razao social e nome fantasia nao podem ser nulos"); 
    }
    
}