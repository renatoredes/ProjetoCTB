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
@Table(name="abastecimento")
public class Abastecimento {

		private int codigoAbastecimento;
		private Date dataHoraAbastecimento;
		private double valorLitro;
		private double valorTotal;
		private int quantidadeAbastecimento;
		
		private Veiculo veiculo;
		private Frentista frentista;
		private OrdemAbastecimento ordemAbastecimento;
		
		/**
		 * @return the codigoAbastecimento
		 */
		public int getCodigoAbastecimento() {
			return codigoAbastecimento;
		}

		/**
		 * @param codigoAbastecimento the codigoAbastecimento to set
		 */
		public void setCodigoAbastecimento(int codigoAbastecimento) {
			this.codigoAbastecimento = codigoAbastecimento;
		}

		/**
		 * @return the dataHoraAbastecimento
		 */
		public Date getDataHoraAbastecimento() {
			return dataHoraAbastecimento;
		}

		/**
		 * @param dataHoraAbastecimento the dataHoraAbastecimento to set
		 */
		public void setDataHoraAbastecimento(Date dataHoraAbastecimento) {
			this.dataHoraAbastecimento = dataHoraAbastecimento;
		}

		/**
		 * @return the valorLitro
		 */
		public double getValorLitro() {
			return valorLitro;
		}

		/**
		 * @param valorLitro the valorLitro to set
		 */
		public void setValorLitro(double valorLitro) {
			this.valorLitro = valorLitro;
		}

		/**
		 * @return the valorTotal
		 */
		public double getValorTotal() {
			return valorTotal;
		}

		/**
		 * @param valorTotal the valorTotal to set
		 */
		public void setValorTotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}

		/**
		 * @return the quantidadeAbastecimento
		 */
		public int getQuantidadeAbastecimento() {
			return quantidadeAbastecimento;
		}

		/**
		 * @param quantidadeAbastecimento the quantidadeAbastecimento to set
		 */
		public void setQuantidadeAbastecimento(int quantidadeAbastecimento) {
			this.quantidadeAbastecimento = quantidadeAbastecimento;
		}

		/**
		 * @return the veiculo
		 */
		public Veiculo getVeiculo() {
			return veiculo;
		}

		/**
		 * @param veiculo the veiculo to set
		 */
		public void setVeiculo(Veiculo veiculo) {
			this.veiculo = veiculo;
		}

		/**
		 * @return the frentista
		 */
		public Frentista getFrentista() {
			return frentista;
		}

		/**
		 * @param frentista the frentista to set
		 */
		public void setFrentista(Frentista frentista) {
			this.frentista = frentista;
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

		
		
}
