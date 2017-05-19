/**
 * 
 */
package br.com.psc.projetoctb.model.basicas;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

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

	@OneToMany
	@JoinTable(name = "TipoAbastecimento_Abastecimento",
	joinColumns = @JoinColumn(name = "TipoAbastecimento_Id"),
    inverseJoinColumns = @JoinColumn ( name ="Abastecimento_Id"))
	private Collection<Abastecimento> abastecimenento = new ArrayList<Abastecimento>();

	public Collection<Abastecimento> getAbastecimenento() {
		return abastecimenento;
	}

	public void setAbastecimenento(Collection<Abastecimento> abastecimenento) {
		this.abastecimenento = abastecimenento;
	}

}