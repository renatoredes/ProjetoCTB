package br.com.psc.projetoctb.model.basicas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira, João 
 *
 */
@Entity
public class VeiculoModelo {

	@Id
	@GeneratedValue
	private long id;
	
	private String cor;
	private String anoDeFabricacao;
	private String nomeDoFabricante;
	private String modeloVeiculo;
	
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
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	/**
	 * @return the anoDeFabricacao
	 */
	public String getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	/**
	 * @param anoDeFabricacao the anoDeFabricacao to set
	 */
	public void setAnoDeFabricacao(String anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	/**
	 * @return the nomeDoFabricante
	 */
	public String getNomeDoFabricante() {
		return nomeDoFabricante;
	}
	/**
	 * @param nomeDoFabricante the nomeDoFabricante to set
	 */
	public void setNomeDoFabricante(String nomeDoFabricante) {
		this.nomeDoFabricante = nomeDoFabricante;
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
