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
@Table(name="endereco")
public class Endereco {

	private String cepEndereco;
	private int numeroEndereco;
	private String ruaEndereco;
	private String bairroEndereco;
	private String estadoEndereco;
	
	
	/**
	 * @return the cepEndereco
	 */
	public String getCepEndereco() {
		return cepEndereco;
	}
	/**
	 * @param cepEndereco the cepEndereco to set
	 */
	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}
	/**
	 * @return the numeroEndereco
	 */
	public int getNumeroEndereco() {
		return numeroEndereco;
	}
	/**
	 * @param numeroEndereco the numeroEndereco to set
	 */
	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}
	/**
	 * @return the ruaEndereco
	 */
	public String getRuaEndereco() {
		return ruaEndereco;
	}
	/**
	 * @param ruaEndereco the ruaEndereco to set
	 */
	public void setRuaEndereco(String ruaEndereco) {
		this.ruaEndereco = ruaEndereco;
	}
	/**
	 * @return the bairroEndereco
	 */
	public String getBairroEndereco() {
		return bairroEndereco;
	}
	/**
	 * @param bairroEndereco the bairroEndereco to set
	 */
	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}
	/**
	 * @return the estadoEndereco
	 */
	public String getEstadoEndereco() {
		return estadoEndereco;
	}
	/**
	 * @param estadoEndereco the estadoEndereco to set
	 */
	public void setEstadoEndereco(String estadoEndereco) {
		this.estadoEndereco = estadoEndereco;
	}
	
	
}
