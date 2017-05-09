/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

/**
 * @author Jeferson
 *
 */
public class Veiculo {
	
	private String placaVeiculo;
	private String veiculoAgregado;
	private String veiculoEmpresa;
	
	private ModeloVeiculo modeloVeiculo; 
	private Colaborador colaborador;  
	
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
	 * @return the colaborador
	 */
	public Colaborador getColaborador() {
		return colaborador;
	}
	/**
	 * @param colaborador the colaborador to set
	 */
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
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
