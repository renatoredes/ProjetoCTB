/**
 * 
 */
package br.com.psc.projetoctb.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.psc.projetoctb.model.basicas.Empresa;
import br.com.psc.projetoctb.model.basicas.Endereco;
import br.com.psc.projetoctb.model.basicas.FuncionarioMotorista;
import br.com.psc.projetoctb.model.basicas.Gerente;
import br.com.psc.projetoctb.model.basicas.Pessoa;
import br.com.psc.projetoctb.model.basicas.Veiculo;
import br.com.psc.projetoctb.model.dao.geral.DAOFactory;
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
		Fachada.getInstancia().salvarNovoGerente(g);
	}
	
	public static void main(String args[]) throws Exception{
		incluir();	
	}

}

