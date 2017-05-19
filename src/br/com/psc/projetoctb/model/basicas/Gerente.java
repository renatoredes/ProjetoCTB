package br.com.psc.projetoctb.model.basicas;

import javax.persistence.Entity;

@Entity
public class Gerente extends Pessoa {

	private int codigoGerente;

	public int getCodigoGerente() {
		return codigoGerente;
	}

	public void setCodigoGerente(int codigoGerente) {
		this.codigoGerente = codigoGerente;
	}
	
	

}
