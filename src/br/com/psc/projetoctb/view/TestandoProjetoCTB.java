/**
 * 
 */
package br.com.psc.projetoctb.view;


import br.com.psc.projetoctb.model.basicas.FuncionarioMotorista;
import br.com.psc.projetoctb.model.basicas.Gerente;
import br.com.psc.projetoctb.model.fachada.Fachada;

/**
 * @author Jeferson
 *
 */

public class TestandoProjetoCTB {
	
	private static void incluir() throws Exception{
		Gerente g = new Gerente();
		g.setNome("Melissa Sousa Barbosa");
		g.setCpf("73007592542");
		g.setEstadoCivil("Solteira");
		g.setFuncao("Gerente");
		g.setRg("1234567");
		g.setIdade("19");
		g.setTelefone("(14)9798-4646");
		g.setCelular("(81)9345-6212");
		Fachada.getInstancia().salvarNovoGerente(g);
		
		FuncionarioMotorista fm = new FuncionarioMotorista();
		fm.setNome("Livia Cardoso Sousa");
		fm.setCpf("98252783406");
		fm.setEstadoCivil("Solteira");
		fm.setFuncao("FuncionariaMotorista");
		fm.setRg("3012234");
		fm.setIdade("20");
		fm.setTelefone("(14)9398-4446");
		fm.setCelular("(81)9845-0202");
		Fachada.getInstancia().salvarNovoFuncionarioMotorista(fm);
	
	}
	
	public static void main(String args[]) throws Exception{
		incluir();	
	}
}

