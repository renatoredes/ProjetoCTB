/**
 * 
 */
package br.com.psc.projetoctb.model.vo;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira
 *
 */
@Entity
@Table(name="solicitaAbastecimento")
public class SolicitaAbastecimento {

	private int codigoSolicitacaoAbastecimento;
	private Date dataSolicitacaoAbastecimento;
	private String observacaoSolicitacaoAbastecimento;
	
	private Colaborador colaborador;
	private OrdemAbastecimento ordemAbastecimento;
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
	 * @return the colaborador
	 */
	public Colaborador getColaborador() {
		return colaborador;
	}
	/**
	 * @param colaborador the colaborador to set
	 */
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	/**
	 * @return the ordemAbastecimento
	 */
	public OrdemAbastecimento getOrdemAbastecimento() {
		return ordemAbastecimento;
	}
	/**
	 * @param ordemAbastecimento the ordemAbastecimento to set
	 */
	public void setOrdemAbastecimento(OrdemAbastecimento ordemAbastecimento) {
		this.ordemAbastecimento = ordemAbastecimento;
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
