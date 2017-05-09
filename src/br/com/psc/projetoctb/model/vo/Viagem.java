/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

/**
 * @author Jeferson
 *
 */
public class Viagem {
	
	private int codigoViagem;
	private String destinoViagem;
	private int kmInicial;
	private int kmFinal;
	private int kmTotal;
	
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
	private Colaborador colaborador;
	
	/**
	 * @return the codigoViagem
	 */
	public int getCodigoViagem() {
		return codigoViagem;
	}
	/**
	 * @param codigoViagem the codigoViagem to set
	 */
	public void setCodigoViagem(int codigoViagem) {
		this.codigoViagem = codigoViagem;
	}
	/**
	 * @return the destinoViagem
	 */
	public String getDestinoViagem() {
		return destinoViagem;
	}
	/**
	 * @param destinoViagem the destinoViagem to set
	 */
	public void setDestinoViagem(String destinoViagem) {
		this.destinoViagem = destinoViagem;
	}
	/**
	 * @return the kmInicial
	 */
	public int getKmInicial() {
		return kmInicial;
	}
	/**
	 * @param kmInicial the kmInicial to set
	 */
	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}
	/**
	 * @return the kmFinal
	 */
	public int getKmFinal() {
		return kmFinal;
	}
	/**
	 * @param kmFinal the kmFinal to set
	 */
	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
	/**
	 * @return the kmTotal
	 */
	public int getKmTotal() {
		return kmTotal;
	}
	/**
	 * @param kmTotal the kmTotal to set
	 */
	public void setKmTotal(int kmTotal) {
		this.kmTotal = kmTotal;
	}


}
