/**
 * 
 */
package br.com.psc.projetoctb.model.fachada;

import br.com.psc.projetoctb.model.basicas.FuncionarioMotorista;
import br.com.psc.projetoctb.model.basicas.Gerente;
import br.com.psc.projetotcb.model.rn.GerenteRN;
import br.com.psc.projetotcb.model.rn.FuncionarioMotoristaRN;

/**
 * @author Jeferson
 *
 */
public class Fachada {
    private static Fachada instancia;
    private static GerenteRN gerenteRN;
    private static FuncionarioMotoristaRN fmRN;
    
    private Fachada(){
    	gerenteRN = new GerenteRN();
    	fmRN = new FuncionarioMotoristaRN();
    }
    
    public static Fachada getInstancia(){
        if(instancia==null) instancia=new Fachada();
        return instancia;
    }

    /**
     * 
     * @param Objeto contendo os dados do Gerente
     * @throws Exception
     */
    public void salvarNovoGerente(Gerente g)throws Exception{
    	gerenteRN.inserirNovo(g);
    }
    
    /**
     * 
     * @param fm contendo os dados de Funcionario Motorista 
     * @throws Exception
     */
    
    public void salvarNovoFuncionarioMotorista(FuncionarioMotorista fm) throws Exception{
    	fmRN.inserirNovo(fm);
    }

}
