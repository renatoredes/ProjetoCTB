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
	private String placa;
	private String chassis;
	private int numeroDocumento;
	private int kmInicial;
	private int kmFinal;
	
	
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

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the chassis
	 */
	public String getChassis() {
		return chassis;
	}

	/**
	 * @param chassis the chassis to set
	 */
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	/**
	 * @return the numeroDocumento
	 */
	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * @return the kmInicial
	 */
	public int getKmInicial() {
		return kmInicial;
	}

	/**
	 * @param kmInicial the kmInicial to set
	 */
	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}

	/**
	 * @return the kmFinal
	 */
	public int getKmFinal() {
		return kmFinal;
	}

	/**
	 * @param kmFinal the kmFinal to set
	 */
	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
	
}
