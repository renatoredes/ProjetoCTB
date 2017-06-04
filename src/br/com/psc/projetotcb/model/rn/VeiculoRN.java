package br.com.psc.projetotcb.model.rn;

import br.com.psc.projetoctb.model.basicas.Veiculo;
import br.com.psc.projetoctb.model.dao.VeiculoDAO;
import br.com.psc.projetoctb.model.dao.geral.DAOFactory;

public class VeiculoRN {
	
	private VeiculoDAO vd;
	
	public VeiculoRN(){
		vd = DAOFactory.getVeiculoDAO();
	}
	

    public void inserirNovo(Veiculo v)throws Exception {
        validaPreenchimento(v);
        
        vd.insert(v);
    }
    
    
    
//================================================
    
    private void validaPreenchimento(Veiculo v) throws Exception{
    	
    	if (v.getPlaca() == null)
    		throw new Exception("Placa nao pode ser nula"); 
	
    }
}
