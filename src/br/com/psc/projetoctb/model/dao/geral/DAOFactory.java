package br.com.psc.projetoctb.model.dao.geral;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.psc.projetoctb.model.dao.*;

/**
 * @author Jeferson Junior
 *
 */

public abstract class DAOFactory {
	
	private static final EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("exemploPU"); //setar o nome do persistence-unit aqui 
	}
	
	public static GerenteDAO getGerenteDAO(){
		GerenteDAO  dao = new GerenteDAO(factory);
		return dao;
	}
	
	public static FuncionarioMotoristaDAO getFuncionarioMotoristaDAO(){
		FuncionarioMotoristaDAO  dao = new FuncionarioMotoristaDAO(factory);
		return dao;
	}
	
	
	public static EmpresaDAO getEmpresaDAO(){
		EmpresaDAO dao = new EmpresaDAO(factory);
		return dao;
	}
	
	public static VeiculoDAO getVeiculoDAO(){
		VeiculoDAO  dao = new VeiculoDAO(factory);
		return dao;
	}
	
	public static AbastecimentoDAO getAbastecimentoDAO(){
		AbastecimentoDAO  dao = new AbastecimentoDAO(factory);
		return dao;
	}
	
	public static VeiculoModeloDAO getVeiculoModeloDAO(){
		VeiculoModeloDAO dao = new VeiculoModeloDAO(factory);
		return dao;
	}
	
	public static TipoAbastecimentoDAO getTipoAbastecimentoDAO(){
		TipoAbastecimentoDAO dao = new TipoAbastecimentoDAO(factory);
		return dao;
	}
	
	public static SolicitacaoAbastecimentoDAO getSolicitacaoAbastecimentoDAO(){
		SolicitacaoAbastecimentoDAO dao = new SolicitacaoAbastecimentoDAO(factory);
		return dao;
	}
	public static EnderecoDAO getEnderecoDAO(){
		EnderecoDAO dao = new EnderecoDAO(factory);
		return dao;
	}
}
