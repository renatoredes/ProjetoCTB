/**
 * 
 */
package br.com.psc.projetoctb.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira
 *
 */
@Entity
@Table(name="gerente")
public class Gerente extends Pessoa {

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "gerente")
	private List<SolicitaAbastecimento> solicitaAbastecimentos;

	/**
	 * @return the solicitaAbastecimentos
	 */
	public List<SolicitaAbastecimento> getSolicitaAbastecimentos() {
		return solicitaAbastecimentos;
	}

	/**
	 * @param solicitaAbastecimentos the solicitaAbastecimentos to set
	 */
	public void setSolicitaAbastecimentos(List<SolicitaAbastecimento> solicitaAbastecimentos) {
		this.solicitaAbastecimentos = solicitaAbastecimentos;
	}
	
}
