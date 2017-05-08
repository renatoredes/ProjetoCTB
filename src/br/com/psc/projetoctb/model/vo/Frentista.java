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
@Table(name="frentista")
public class Frentista extends Pessoa {

		private int matriculaFrentista;
		
		private PostoDeCombustivel postoDeCombustivel;

		/**
		 * @return the matriculaFrentista
		 */
		public int getMatriculaFrentista() {
			return matriculaFrentista;
		}

		/**
		 * @param matriculaFrentista the matriculaFrentista to set
		 */
		public void setMatriculaFrentista(int matriculaFrentista) {
			this.matriculaFrentista = matriculaFrentista;
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
