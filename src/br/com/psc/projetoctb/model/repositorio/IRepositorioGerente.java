package br.com.psc.projetoctb.model.repositorio;

import br.com.psc.projetoctb.model.basicas.Gerente;

public interface IRepositorioGerente {

public void inserirGerente(Gerente gerente);
	
	public void removerGerente(Gerente gerente);
	
	public void alterarGerente(Gerente gerente);
	
	public Gerente consultarporId(Integer id);
}
