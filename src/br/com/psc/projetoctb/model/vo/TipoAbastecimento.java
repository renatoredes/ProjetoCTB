/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira
 *
 */
@Entity
@Table(name="tipoAbastecimento")
public class TipoAbastecimento {
	
	private int codigoDoCombustivel;
	private String especificacaoAbastecimento;
	
	/**
	 * @return the codigoDoCombustivel
	 */
	public int getCodigoDoCombustivel() {
		return codigoDoCombustivel;
	}
	/**
	 * @param codigoDoCombustivel the codigoDoCombustivel to set
	 */
	public void setCodigoDoCombustivel(int codigoDoCombustivel) {
		this.codigoDoCombustivel = codigoDoCombustivel;
	}
	/**
	 * @return the especificacaoAbastecimento
	 */
	public String getEspecificacaoAbastecimento() {
		return especificacaoAbastecimento;
	}
	/**
	 * @param especificacaoAbastecimento the especificacaoAbastecimento to set
	 */
	public void setEspecificacaoAbastecimento(String especificacaoAbastecimento) {
		this.especificacaoAbastecimento = especificacaoAbastecimento;
	}
}
