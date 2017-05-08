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
@Table(name="tipoAbastecimento")
public class TipoAbastecimento {
	
	private int codigoDoCombustivel;
	private String especificacaoAbastecimento;
	
}
