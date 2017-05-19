/**
 * 
 */
package br.com.psc.projetoctb.model.basicas;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Caio Phillipe
 *
 */
@Entity
public class Abastecimento {

	@Id
	@GeneratedValue
	private long id;
	
	private int numeroCupomFiscal;
	private String dataHoraAbastecimento;
	private double valorLitro;
	private double valorTotal;
	private double quantidadeAbastecimento;
	
	@ManyToOne
	@JoinColumn(name="veiculo_id")
	private Veiculo veiculo;
	
	
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
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the numeroCupomFiscal
	 */
	public int getNumeroCupomFiscal() {
		return numeroCupomFiscal;
	}
	/**
	 * @param numeroCupomFiscal the numeroCupomFiscal to set
	 */
	public void setNumeroCupomFiscal(int numeroCupomFiscal) {
		this.numeroCupomFiscal = numeroCupomFiscal;
	}
	/**
	 * @return the dataHoraAbastecimento
	 */
	public String getDataHoraAbastecimento() {
		return dataHoraAbastecimento;
	}
	/**
	 * @param dataHoraAbastecimento the dataHoraAbastecimento to set
	 */
	public void setDataHoraAbastecimento(String dataHoraAbastecimento) {
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
	public double getQuantidadeAbastecimento() {
		return quantidadeAbastecimento;
	}
	/**
	 * @param quantidadeAbastecimento the quantidadeAbastecimento to set
	 */
	public void setQuantidadeAbastecimento(double quantidadeAbastecimento) {
		this.quantidadeAbastecimento = quantidadeAbastecimento;
	}
	
	
	
	
}
