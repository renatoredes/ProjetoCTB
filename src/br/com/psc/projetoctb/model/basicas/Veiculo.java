/**
 * 
 */
package br.com.psc.projetoctb.model.basicas;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;




/**
 * @author Jeferson Guerra, Caio Phillipe, Renato Ferreira.
 *
 */
@Entity
@Table(name="veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@JoinColumn(name="idVeiculo")
	private int id;
	
	private String placaVeiculo;
	private String veiculoAgregado;
	private String veiculoEmpresa;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ModeloVeiculo modeloVeiculo; 
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "veiculo")
	private List<Abastecimento> abastecimentos;
	
		
	@ManyToOne
	@JoinColumn(name= "idPessoa", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	private Pessoa pessoa;
	
	/**
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}
	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	/**
	 * @return the modeloVeiculo
	 */
	public ModeloVeiculo getModeloVeiculo() {
		return modeloVeiculo;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
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
