package br.com.psc.projetoctb.model.basicas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {

	
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String nome;
		private String idade;
		private String cpf;
		private String rg;
		private String telefone;
		private String celular;
		private String estadoCivil;
		private String funcao;
		//private String login;   //<<< 
		//private String senha;   //<<<
		
		private Endereco endereco;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getIdade() {
			return idade;
		}
		/**
		 * @return the cpf
		 */
		public String getCpf() {
			return cpf;
		}
		/**
		 * @param cpf the cpf to set
		 */
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		/**
		 * @return the rg
		 */
		public String getRg() {
			return rg;
		}
		/**
		 * @param rg the rg to set
		 */
		public void setRg(String rg) {
			this.rg = rg;
		}
		/**
		 * @return the telefone
		 */
		public String getTelefone() {
			return telefone;
		}
		/**
		 * @param telefone the telefone to set
		 */
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		/**
		 * @return the celular
		 */
		public String getCelular() {
			return celular;
		}
		/**
		 * @param celular the celular to set
		 */
		public void setCelular(String celular) {
			this.celular = celular;
		}
		/**
		 * @return the estadoCivil
		 */
		public String getEstadoCivil() {
			return estadoCivil;
		}
		/**
		 * @param estadoCivil the estadoCivil to set
		 */
		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
		/**
		 * @return the funcao
		 */
		public String getFuncao() {
			return funcao;
		}
		/**
		 * @param funcao the funcao to set
		 */
		public void setFuncao(String funcao) {
			this.funcao = funcao;
		}
		/**
		 * @return the endereco
		 */
		public Endereco getEndereco() {
			return endereco;
		}
		/**
		 * @param endereco the endereco to set
		 */
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
		public void setIdade(String idade) {
			this.idade = idade;
		}
		
		@Override
		public String toString(){
			return "Nome de Pessoa: "+nome+", Idade: "+idade+", cpf: "+
		    cpf+", rg: "+ rg+ ", telefone: "+ telefone + ", celular: "+
	        celular + ", estado civil: " + estadoCivil + ", funcao: " + 
		    funcao + endereco;
		}
		
		
		
		
}

