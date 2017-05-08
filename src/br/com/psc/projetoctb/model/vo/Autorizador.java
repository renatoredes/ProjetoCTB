/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira
 *
 */
@Entity
@Table(name="autorizador")
public class Autorizador extends Pessoa {
	
	private int matriculaAutorizador;
	private String funcaoAutorizador;
	/**
	 * @return the matriculaAutorizador
	 */
	public int getMatriculaAutorizador() {
		return matriculaAutorizador;
	}
	/**
	 * @param matriculaAutorizador the matriculaAutorizador to set
	 */
	public void setMatriculaAutorizador(int matriculaAutorizador) {
		this.matriculaAutorizador = matriculaAutorizador;
	}
	/**
	 * @return the funcaoAutorizador
	 */
	public String getFuncaoAutorizador() {
		return funcaoAutorizador;
	}
	/**
	 * @param funcaoAutorizador the funcaoAutorizador to set
	 */
	public void setFuncaoAutorizador(String funcaoAutorizador) {
		this.funcaoAutorizador = funcaoAutorizador;
	}
	
	
}
