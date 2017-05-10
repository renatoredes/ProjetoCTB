/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



/**
 * @author Jeferson Guerra, Caio Phillipe, Renato Ferreira.
 *
 */
@Entity
@Table(name="veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String placaVeiculo;
	private String veiculoAgregado;
	private String veiculoEmpresa;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ModeloVeiculo modeloVeiculo; 
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "veiculo")
	@JoinColumn(name = "veiculo_id")
	private List<Abastecimento> abastecimentos;
	
	/**
	 * @return the modeloVeiculo
	 */
	public ModeloVeiculo getModeloVeiculo() {
		return modeloVeiculo;
	}
	/**
	 * @param modeloVeiculo the modeloVeiculo to set
	 */
	public void setModeloVeiculo(ModeloVeiculo modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	
	/**
	 * @return the placaVeiculo
	 */
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	/**
	 * @param placaVeiculo the placaVeiculo to set
	 */
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
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
	 * @return the veiculoEmpresa
	 */
	public String getVeiculoEmpresa() {
		return veiculoEmpresa;
	}
	/**
	 * @param veiculoEmpresa the veiculoEmpresa to set
	 */
	public void setVeiculoEmpresa(String veiculoEmpresa) {
		this.veiculoEmpresa = veiculoEmpresa;
	}


}
