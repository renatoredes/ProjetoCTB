/**
 * 
 */
package br.com.psc.projetoctb.model.basicas;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 * @author Jeferson
 *
 */

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue
	private int codigoEndereco;
	private String cep;
	private int numero;
	private String rua;
	private String bairro;
	private String estado;
	public int getCodigoEndereco() {
		return codigoEndereco;
	}
	public void setCodigoEndereco(int codigoEndereco) {
		this.codigoEndereco = codigoEndereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@OneToMany
	@JoinTable(name = "Endereco_Empresa",
	joinColumns = @JoinColumn(name = "Endereco_id"),
    inverseJoinColumns = @JoinColumn ( name =" Empresa_id "))
	private Collection<Empresa> empresa= new ArrayList<Empresa>();
	public Collection<Empresa> getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Collection<Empresa> empresa) {
		this.empresa = empresa;
	}
	
	
	
	
}
