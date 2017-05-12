/**
 * 
 */
package br.com.psc.projetoctb.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author Jeferson Guerra, Caio Phillipe, Renato Ferreira.
 *
 */
@Entity
@Table(name="empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@JoinColumn(name="idEmpresa")
	private int id;
	
	private String cnpjEmpresa;
	private String nomeFantazia;
	private String razaoSocial;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
	private List<Pessoa> pessoas;
	
	@ManyToOne
	@JoinColumn(name= "idEndereco", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	private Endereco endereco;

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
	 * @return the pessoas
	 */
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	/**
	 * @param pessoas the pessoas to set
	 */
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
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
