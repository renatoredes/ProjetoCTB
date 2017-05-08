/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

import java.sql.Date;

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
		private String observacaoAbastecimento;
		
		private Colaborador colaborador;
		
		
		
}
