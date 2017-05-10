/**
 * 
 */
package br.com.psc.projetoctb.model.vo;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
	private String observacaoSolicitacaoAbastecimento;
	
	
	private TipoAbastecimento tipoAbastecimento;
	
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
	/**
	 * @return the observacaoSolicitacaoAbastecimento
	 */
	public String getObservacaoSolicitacaoAbastecimento() {
		return observacaoSolicitacaoAbastecimento;
	}
	/**
	 * @param observacaoSolicitacaoAbastecimento the observacaoSolicitacaoAbastecimento to set
	 */
	public void setObservacaoSolicitacaoAbastecimento(String observacaoSolicitacaoAbastecimento) {
		this.observacaoSolicitacaoAbastecimento = observacaoSolicitacaoAbastecimento;
	}
	
	/**
	 * @return the tipoAbastecimento
	 */
	public TipoAbastecimento getTipoAbastecimento() {
		return tipoAbastecimento;
	}
	/**
	 * @param tipoAbastecimento the tipoAbastecimento to set
	 */
	public void setTipoAbastecimento(TipoAbastecimento tipoAbastecimento) {
		this.tipoAbastecimento = tipoAbastecimento;
	}
}
