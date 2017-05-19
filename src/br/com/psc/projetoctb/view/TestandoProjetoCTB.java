package br.com.psc.projetoctb.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.psc.projetoctb.model.basicas.FuncionarioMotorista;
import br.com.psc.projetoctb.model.basicas.Gerente;
import br.com.psc.projetoctb.model.basicas.Pessoa;



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
		
		
			em.persist(p);
			em.persist(f);
			em.persist(g);
			
		
			em.getTransaction().commit(); 
		
		System.out.println("salvo com sucesso projeto FaculdadeRenatoFerreira");
		System.out.println("www.alosuporte.com.br");

		em.close();
		emF.close();

	}

}
