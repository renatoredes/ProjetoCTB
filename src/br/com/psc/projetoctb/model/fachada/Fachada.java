/**
 * 
 */
package br.com.psc.projetoctb.model.fachada;

import br.com.psc.projetoctb.model.basicas.Gerente;
import br.com.psc.projetotcb.model.rn.GerenteRN;

/**
 * @author Jeferson
 *
 */
public class Fachada {
    private static Fachada instancia;
    private static GerenteRN gerenteRN;
    
    private Fachada(){
    	gerenteRN = new GerenteRN();
    }
    
    public static Fachada getInstancia(){
        if(instancia==null) instancia=new Fachada();
        return instancia;
    }

    /**
     * 
     * @param Objeto contendo os dados do Gerente
     * @throws GeralException
     */
    public void salvarNovoGerente(Gerente g)throws Exception{
    	gerenteRN.inserirNovo(g);
    }

}
