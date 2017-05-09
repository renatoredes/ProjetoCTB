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
@Table(name="postoCombustivel")
public class PostoCombustivel {

	private String cnpjPosto;
	private String nomeFantasia;
	private String razaoSocialPosto;
	
	private Endereco endereco;
	/**
	 * @return the cnpjPosto
	 */
	public String getCnpjPosto() {
		return cnpjPosto;
	}
	/**
	 * @param cnpjPosto the cnpjPosto to set
	 */
	public void setCnpjPosto(String cnpjPosto) {
		this.cnpjPosto = cnpjPosto;
	}
	/**
	 * @return the nomeFantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	/**
	 * @param nomeFantasia the nomeFantasia to set
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	/**
	 * @return the razaoSocialPosto
	 */
	public String getRazaoSocialPosto() {
		return razaoSocialPosto;
	}
	/**
	 * @param razaoSocialPosto the razaoSocialPosto to set
	 */
	public void setRazaoSocialPosto(String razaoSocialPosto) {
		this.razaoSocialPosto = razaoSocialPosto;
	}
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
	
	
}
