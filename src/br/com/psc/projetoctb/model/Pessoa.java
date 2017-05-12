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
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira
 *
 */
@Entity
@Table(name="pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@JoinColumn(name="idPessoa")
	private int id;
	
	private String nome;
	private String senha;
	private int idade;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")
	private List<Veiculo> veiculos;
	
	@ManyToOne
	@JoinColumn(name= "idEmpresa", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	private Empresa empresas;
	
	
	
	/**
	 * @return the empresas
	 */
	public Empresa getEmpresas() {
		return empresas;
	}
	/**
	 * @param empresas the empresas to set
	 */
	public void setEmpresas(Empresa empresas) {
		this.empresas = empresas;
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
	 * @return the veiculos
	 */
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	/**
	 * @param veiculos the veiculos to set
	 */
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
