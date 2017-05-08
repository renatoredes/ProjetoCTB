/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Jeferson Guerra, Caio Phillipe, Renato Ferreira.
 *
 */
@Entity
@Table(name="empresa")
public class Empresa {
	
	private String cnpjEmpresa;
	private String nomeFantazia;
	private String razaoSocial;
	
	private Endereco endereco;

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the cnpjEmpresa
	 */
	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}
	/**
	 * @param cnpjEmpresa the cnpjEmpresa to set
	 */
	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}
	/**
	 * @return the cepEndereco
	 */
	
	/**
	 * @return the nomeFantazia
	 */
	public String getNomeFantazia() {
		return nomeFantazia;
	}
	/**
	 * @param nomeFantazia the nomeFantazia to set
	 */
	public void setNomeFantazia(String nomeFantazia) {
		this.nomeFantazia = nomeFantazia;
	}
	/**
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}
	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	

}
