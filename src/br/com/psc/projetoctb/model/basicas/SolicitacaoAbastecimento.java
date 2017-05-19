package br.com.psc.projetoctb.model.basicas;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SolicitacaoAbastecimento {

	@Id
	private int codigoSolicitaAbastecimento;
	private Date dataSolicitacaoAbastecimento;
	
	public int getCodigoSolicitaAbastecimento() {
		return codigoSolicitaAbastecimento;
	}
	public void setCodigoSolicitaAbastecimento(int codigoSolicitaAbastecimento) {
		this.codigoSolicitaAbastecimento = codigoSolicitaAbastecimento;
	}
	public Date getDataSolicitacaoAbastecimento() {
		return dataSolicitacaoAbastecimento;
	}
	public void setDataSolicitacaoAbastecimento(Date dataSolicitacaoAbastecimento) {
		this.dataSolicitacaoAbastecimento = dataSolicitacaoAbastecimento;
	}
	
	
}
