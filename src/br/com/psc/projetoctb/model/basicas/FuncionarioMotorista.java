package br.com.psc.projetoctb.model.basicas;

import javax.persistence.Entity;

@Entity
public class FuncionarioMotorista extends Pessoa {

	private int codigoFuncionarioMotorista;

	public int getCodigoFuncionarioMotorista() {
		return codigoFuncionarioMotorista;
	}

	public void setCodigoFuncionarioMotorista(int codigoFuncionarioMotorista) {
		this.codigoFuncionarioMotorista = codigoFuncionarioMotorista;
	}

	
	
}
