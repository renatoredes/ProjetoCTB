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
import javax.persistence.Table;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira
 *
 */
@Entity
@Table(name="endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@JoinColumn(name="idEnderco")
	private int id;
	
	private String cepEndereco;
	private int numeroEndereco;
	private String ruaEndereco;
	private String bairroEndereco;
	private String estadoEndereco;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "endereco")
	private List<Empresa> empresas;
	
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
	 * @return the empresas
	 */
	public List<Empresa> getEmpresas() {
		return empresas;
	}
	/**
	 * @param empresas the empresas to set
	 */
	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
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
