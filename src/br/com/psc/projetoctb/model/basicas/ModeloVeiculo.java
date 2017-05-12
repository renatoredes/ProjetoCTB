/**
 * 
 */
package br.com.psc.projetoctb.model.basicas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jeferson Guerra, Caio Phillipe, Renato Ferreira.
 *
 */
@Entity
@Table(name="modeloVeiculo")
public class ModeloVeiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigoModelo;
	
	private int corVeiculo;
	private String anoFabricacao;
	private String nomeFabricante;
	private String modeloVeiculo;
	
	/**
	 * @return the codigoModelo
	 */
	public int getCodigoModelo() {
		return codigoModelo;
	}
	/**
	 * @param codigoModelo the codigoModelo to set
	 */
	public void setCodigoModelo(int codigoModelo) {
		this.codigoModelo = codigoModelo;
	}
	/**
	 * @return the corVeiculo
	 */
	public int getCorVeiculo() {
		return corVeiculo;
	}
	/**
	 * @param corVeiculo the corVeiculo to set
	 */
	public void setCorVeiculo(int corVeiculo) {
		this.corVeiculo = corVeiculo;
	}
	/**
	 * @return the anoFabricacao
	 */
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	/**
	 * @param anoFabricacao the anoFabricacao to set
	 */
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	/**
	 * @return the nomeFabricante
	 */
	public String getNomeFabricante() {
		return nomeFabricante;
	}
	/**
	 * @param nomeFabricante the nomeFabricante to set
	 */
	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}
	/**
	 * @return the modeloVeiculo
	 */
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	/**
	 * @param modeloVeiculo the modeloVeiculo to set
	 */
	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

}
