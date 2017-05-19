/**
 * 
 */
package br.com.psc.projetoctb.model.basicas;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Jeferson
 *
 */
@Entity
public class TipoAbastecimento {
	
	@Id
	private int codigoTipoabastecimento;
	private String especificacao;
	public int getCodigoTipoabastecimento() {
		return codigoTipoabastecimento;
	}
	public void setCodigoTipoabastecimento(int codigoTipoabastecimento) {
		this.codigoTipoabastecimento = codigoTipoabastecimento;
	}
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	

	
}
