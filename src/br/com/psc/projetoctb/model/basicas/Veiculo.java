/**
 * 
 */
package br.com.psc.projetoctb.model.basicas;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira, João 
 *
 */
@Entity
public class Veiculo {
		
	@Id
	@GeneratedValue
	private long id;
	
	private String veiculoAgregado;
	private String veiculoEmpres;
	
	@OneToOne
	@JoinColumn(name="veiculomodelo_id")
	private VeiculoModelo veiculoModelo;
	
	@OneToMany
	@JoinTable(name="veiculo_abastecimento",
	joinColumns=@JoinColumn(name="veiculo_id"),
	inverseJoinColumns=@JoinColumn(name="abastecimento_id"))
	private Collection<Abastecimento> abastecimentos = new ArrayList<Abastecimento>();
	
	
	/**
	 * @return the abastecimentos
	 */
	public Collection<Abastecimento> getAbastecimentos() {
		return abastecimentos;
	}

	/**
	 * @param abastecimentos the abastecimentos to set
	 */
	public void setAbastecimentos(Collection<Abastecimento> abastecimentos) {
		this.abastecimentos = abastecimentos;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the veiculoAgregado
	 */
	public String getVeiculoAgregado() {
		return veiculoAgregado;
	}

	/**
	 * @param veiculoAgregado the veiculoAgregado to set
	 */
	public void setVeiculoAgregado(String veiculoAgregado) {
		this.veiculoAgregado = veiculoAgregado;
	}

	/**
	 * @return the veiculoEmpres
	 */
	public String getVeiculoEmpres() {
		return veiculoEmpres;
	}

	/**
	 * @param veiculoEmpres the veiculoEmpres to set
	 */
	public void setVeiculoEmpres(String veiculoEmpres) {
		this.veiculoEmpres = veiculoEmpres;
	}

	/**
	 * @return the veiculoModelo
	 */
	public VeiculoModelo getVeiculoModelo() {
		return veiculoModelo;
	}

	/**
	 * @param veiculoModelo the veiculoModelo to set
	 */
	public void setVeiculoModelo(VeiculoModelo veiculoModelo) {
		this.veiculoModelo = veiculoModelo;
	}
	
}
