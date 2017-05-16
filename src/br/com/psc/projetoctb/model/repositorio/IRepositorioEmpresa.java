package br.com.psc.projetoctb.model.repositorio;

import br.com.psc.projetoctb.model.basicas.Empresa;

public interface IRepositorioEmpresa {

	public void inserirEmpresa(Empresa empresa);
	
	public void removerEmpresa(Empresa empresa);
	
	public void alterarALuno(Empresa empresa);
	
	public Empresa consultarporId(Integer id);
}
