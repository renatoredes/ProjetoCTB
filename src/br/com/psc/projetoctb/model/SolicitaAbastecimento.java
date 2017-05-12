/**
 * 
 */
package br.com.psc.projetoctb.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira
 *
 */
@Entity
@Table(name="solicitaAbastecimento")
public class SolicitaAbastecimento {

	private int codigoSolicitacaoAbastecimento;
	
	@Temporal(TemporalType.TIMESTAMP) //@Temporal informa o tipo de data que será salvo.
	private Date dataSolicitacaoAbastecimento;
	
	
	@ManyToOne
	@JoinColumn(name= "id", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	private Gerente gerente;
	
	@ManyToOne
	@JoinColumn(name= "id", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	private Motorista motorista;
	
	
	/**
	 * @return the gerente
	 */
	public Gerente getGerente() {
		return gerente;
	}
	/**
	 * @param gerente the gerente to set
	 */
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	/**
	 * @return the motorista
	 */
	public Motorista getMotorista() {
		return motorista;
	}
	/**
	 * @param motorista the motorista to set
	 */
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	/**
	 * @return the codigoSolicitacaoAbastecimento
	 */
	public int getCodigoSolicitacaoAbastecimento() {
		return codigoSolicitacaoAbastecimento;
	}
	/**
	 * @param codigoSolicitacaoAbastecimento the codigoSolicitacaoAbastecimento to set
	 */
	public void setCodigoSolicitacaoAbastecimento(int codigoSolicitacaoAbastecimento) {
		this.codigoSolicitacaoAbastecimento = codigoSolicitacaoAbastecimento;
	}
	/**
	 * @return the dataSolicitacaoAbastecimento
	 */
	public Date getDataSolicitacaoAbastecimento() {
		return dataSolicitacaoAbastecimento;
	}
	/**
	 * @param dataSolicitacaoAbastecimento the dataSolicitacaoAbastecimento to set
	 */
	public void setDataSolicitacaoAbastecimento(Date dataSolicitacaoAbastecimento) {
		this.dataSolicitacaoAbastecimento = dataSolicitacaoAbastecimento;
	}
	
}
