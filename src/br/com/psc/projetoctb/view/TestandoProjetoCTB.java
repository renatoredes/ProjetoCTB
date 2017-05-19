package br.com.psc.projetoctb.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.psc.projetoctb.model.basicas.Abastecimento;
import br.com.psc.projetoctb.model.basicas.Empresa;
import br.com.psc.projetoctb.model.basicas.Endereco;
import br.com.psc.projetoctb.model.basicas.FuncionarioMotorista;
import br.com.psc.projetoctb.model.basicas.Gerente;
import br.com.psc.projetoctb.model.basicas.Pessoa;
import br.com.psc.projetoctb.model.basicas.TipoAbastecimento;



public class TestandoProjetoCTB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emF.createEntityManager();

		
		em.getTransaction().begin();
				 
		Pessoa p = new Pessoa();
		
		p.setNome("Pessoa");
		p.setIdade("22");
		
		FuncionarioMotorista f = new FuncionarioMotorista();
		
		f.setNome("User1");
		f.setIdade("10");
		f.setCodigoFuncionarioMotorista(87);
		
		Gerente g = new Gerente();
		g.setNome("User21");
		g.setIdade("101");
		g.setCodigoGerente(100);
		
		Empresa empresa = new Empresa();
		
		empresa.setCnpjEmpresa("CNPJ : 01.611.929/0001-10");
		empresa.setNomeFantasia("Digital center");
		
		Endereco endereco = new Endereco();
		endereco.setCep("54325-777");
		endereco.setRua("Rua da tecnloiga");
		
			
		TipoAbastecimento tipoabastecimento = new TipoAbastecimento();
		tipoabastecimento.setEspecificacao("Gasolina");
		
		    em.persist(p);
			em.persist(f);
			em.persist(g);
			em.persist(empresa);
			em.persist(endereco);
		    em.persist(tipoabastecimento);
			
		
			em.getTransaction().commit(); 
		
		System.out.println("salvo com sucesso projeto CTB");
		System.out.println("www.alosuporte.com.br");

		em.close();
		emF.close();

	}

}
