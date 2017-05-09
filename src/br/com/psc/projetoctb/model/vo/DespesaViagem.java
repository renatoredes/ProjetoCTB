/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

/**
 * @author Jeferson
 *
 */
public class DespesaViagem {
	
	private int codigoDespesaViagem;
	private float pedagio;
	private float refeicao;
	private String outros;
	
	private Viagem viagem;
	
	/**
	 * @return the viagem
	 */
	public Viagem getViagem() {
		return viagem;
	}
	/**
	 * @param viagem the viagem to set
	 */
	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}
	/**
	 * @return the codigoDespesaViagem
	 */
	public int getCodigoDespesaViagem() {
		return codigoDespesaViagem;
	}
	/**
	 * @param codigoDespesaViagem the codigoDespesaViagem to set
	 */
	public void setCodigoDespesaViagem(int codigoDespesaViagem) {
		this.codigoDespesaViagem = codigoDespesaViagem;
	}
	/**
	 * @return the pedagio
	 */
	public float getPedagio() {
		return pedagio;
	}
	/**
	 * @param pedagio the pedagio to set
	 */
	public void setPedagio(float pedagio) {
		this.pedagio = pedagio;
	}
	/**
	 * @return the refeicao
	 */
	public float getRefeicao() {
		return refeicao;
	}
	/**
	 * @param refeicao the refeicao to set
	 */
	public void setRefeicao(float refeicao) {
		this.refeicao = refeicao;
	}
	/**
	 * @return the outros
	 */
	public String getOutros() {
		return outros;
	}
	/**
	 * @param outros the outros to set
	 */
	public void setOutros(String outros) {
		this.outros = outros;
	}
}
