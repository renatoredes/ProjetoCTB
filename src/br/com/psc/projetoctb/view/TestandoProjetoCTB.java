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
import br.com.psc.projetoctb.model.dao.geral.DAOFactory;

/**
 * @author Jeferson
 *
 */

public class TestandoProjetoCTB {
	
	public static void inserir(){
		
		FuncionarioMotorista f = new FuncionarioMotorista();
		f.setNome("User1");
		f.setIdade("10");
		f.setCodigoFuncionarioMotorista(87);
		DAOFactory.getFuncionarioMotoristaDAO().insert(f);
		
		Gerente g = new Gerente();
		g.setNome("User21");
		g.setIdade("101");
		g.setCodigoGerente(100);
		DAOFactory.getGerenteDAO().insert(g);
		
		Empresa empresa = new Empresa();
		empresa.setCnpjEmpresa("CNPJ : 01.611.929/0001-10");
		empresa.setNomeFantasia("Digital center");
		DAOFactory.getEmpresaDAO().insert(empresa);
		
		Endereco endereco = new Endereco();
		endereco.setCep("54325-777");
		endereco.setRua("Rua da tecnloiga");
		DAOFactory.getEnderecoDAO().insert(endereco);
		
	}
	
	
	public static void main(String[] args) {
		
		//testarCadastro();
		inserir();

	}
}
