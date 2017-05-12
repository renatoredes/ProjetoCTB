/**
 * 
 */
package br.com.psc.projetoctb.model.basicas;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira
 *
 */
@Entity
@Table(name="abastecimento")
public class Abastecimento {
		
		
		@Id
		@GeneratedValue(strategy= GenerationType.SEQUENCE)
		@JoinColumn(name="idAbastecimento")
		private int id;
		
		private int codigoAbastecimento;
		
		@Temporal(TemporalType.TIMESTAMP)
		private Date dataHoraAbastecimento;
		
		private double valorLitro;
		private double valorTotal;
		private int quantidadeAbastecimento;
		
		
		@ManyToOne
		@JoinColumn(name= "idVeiculo", insertable=true, updatable=true)
		@Fetch(FetchMode.JOIN)
		@Cascade(CascadeType.SAVE_UPDATE)
		private Veiculo veiculo;
		
		@ManyToOne
		@JoinColumn(name= "idTipoAbastecimento", insertable=true, updatable=true)
		@Fetch(FetchMode.JOIN)
		@Cascade(CascadeType.SAVE_UPDATE)
		private TipoAbastecimento tipoabastecimento;
		
		
		/**
		 * @return the tipoabastecimento
		 */
		public TipoAbastecimento getTipoabastecimento() {
			return tipoabastecimento;
		}

		/**
		 * @param tipoabastecimento the tipoabastecimento to set
		 */
		public void setTipoabastecimento(TipoAbastecimento tipoabastecimento) {
			this.tipoabastecimento = tipoabastecimento;
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

		

		
		
}
