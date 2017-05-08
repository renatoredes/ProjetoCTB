/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

import java.sql.Date;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira
 *
 */
public class Abastecimento {

		private int codigoAbastecimento;
		
		private Date dataHoraAbastecimento;
		private double valorLitro;
		private double valorTotal;
		private int quantidadeAbastecimento;
		
		private PostoDeCombustivel postoDeCombustivel;
		

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
		 * @return the postoDeCombustivel
		 */
		public PostoDeCombustivel getPostoDeCombustivel() {
			return postoDeCombustivel;
		}

		/**
		 * @param postoDeCombustivel the postoDeCombustivel to set
		 */
		public void setPostoDeCombustivel(PostoDeCombustivel postoDeCombustivel) {
			this.postoDeCombustivel = postoDeCombustivel;
		}
		
		
}
