/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoabastecimento")
	private List<Abastecimento> abastecimentos;
	
	/**
	 * @return the abastecimentos
	 */
	public List<Abastecimento> getAbastecimentos() {
		return abastecimentos;
	}
	/**
	 * @param abastecimentos the abastecimentos to set
	 */
	public void setAbastecimentos(List<Abastecimento> abastecimentos) {
		this.abastecimentos = abastecimentos;
	}
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
