package br.com.psc.projetoctb.model.repositorio;

import br.com.psc.projetoctb.model.basicas.Endereco;

public interface IRepositorioEndereco {

public void inserirEndereco(Endereco endereco);
	
	public void removerEndereco(Endereco endereco);
	
	public void alterarEndereco(Endereco endereco);
	
	public Endereco consultarporId(Integer id);
}
