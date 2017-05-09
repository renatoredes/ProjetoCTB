/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Jeferson
 *
 */
@Entity
@Table(name="OrdemAbastecimento")
public class OrdemAbastecimento {
	
	private int codigoOrdemAbastecimento;
	private int statusOrdemAbastecimento;
	private String dataHoraOrdemAbastecimento;
	
	private SolicitaAbastecimento solicitaAbastecimento;
	private TipoAbastecimento tipoAbastecimento;
	private AutorizadorEmpresa autorizadorEmpresa;
	private Abastecimento abastecimento;
	
	/**
	 * @return the solicitaAbastecimento
	 */
	public SolicitaAbastecimento getSolicitaAbastecimento() {
		return solicitaAbastecimento;
	}
	/**
	 * @param solicitaAbastecimento the solicitaAbastecimento to set
	 */
	public void setSolicitaAbastecimento(SolicitaAbastecimento solicitaAbastecimento) {
		this.solicitaAbastecimento = solicitaAbastecimento;
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
	/**
	 * @return the autorizadorEmpresa
	 */
	public AutorizadorEmpresa getAutorizadorEmpresa() {
		return autorizadorEmpresa;
	}
	/**
	 * @param autorizadorEmpresa the autorizadorEmpresa to set
	 */
	public void setAutorizadorEmpresa(AutorizadorEmpresa autorizadorEmpresa) {
		this.autorizadorEmpresa = autorizadorEmpresa;
	}
	/**
	 * @return the abastecimento
	 */
	public Abastecimento getAbastecimento() {
		return abastecimento;
	}
	/**
	 * @param abastecimento the abastecimento to set
	 */
	public void setAbastecimento(Abastecimento abastecimento) {
		this.abastecimento = abastecimento;
	}
	/**
	 * @return the codigoOrdemAbastecimento
	 */
	public int getCodigoOrdemAbastecimento() {
		return codigoOrdemAbastecimento;
	}
	/**
	 * @param codigoOrdemAbastecimento the codigoOrdemAbastecimento to set
	 */
	public void setCodigoOrdemAbastecimento(int codigoOrdemAbastecimento) {
		this.codigoOrdemAbastecimento = codigoOrdemAbastecimento;
	}
	/**
	 * @return the statusOrdemAbastecimento
	 */
	public int getStatusOrdemAbastecimento() {
		return statusOrdemAbastecimento;
	}
	/**
	 * @param statusOrdemAbastecimento the statusOrdemAbastecimento to set
	 */
	public void setStatusOrdemAbastecimento(int statusOrdemAbastecimento) {
		this.statusOrdemAbastecimento = statusOrdemAbastecimento;
	}
	/**
	 * @return the dataHoraOrdemAbastecimento
	 */
	public String getDataHoraOrdemAbastecimento() {
		return dataHoraOrdemAbastecimento;
	}
	/**
	 * @param dataHoraOrdemAbastecimento the dataHoraOrdemAbastecimento to set
	 */
	public void setDataHoraOrdemAbastecimento(String dataHoraOrdemAbastecimento) {
		this.dataHoraOrdemAbastecimento = dataHoraOrdemAbastecimento;
	}


}
