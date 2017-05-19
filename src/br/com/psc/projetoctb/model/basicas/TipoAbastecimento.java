/**
 * 
 */
package br.com.psc.projetoctb.model.basicas;

import javax.persistence.Entity;

/**
 * @author Jeferson
 *
 */
@Entity
public class TipoAbastecimento {
	
	private String especificacao;

	/**
	 * @return the especificacao
	 */
	public String getEspecificacao() {
		return especificacao;
	}

	/**
	 * @param especificacao the especificacao to set
	 */
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	

}
