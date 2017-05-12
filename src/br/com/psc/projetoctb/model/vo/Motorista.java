/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

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
@Table(name="motorista")
public class Motorista extends Pessoa {

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "motorista")
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
