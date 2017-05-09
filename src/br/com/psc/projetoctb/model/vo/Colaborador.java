/**
 * 
 */
package br.com.psc.projetoctb.model.vo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Caio Phillipe, Jefferson Guerra, Renato Ferreira
 *s
 */
@Entity
@Table(name="colaborador")
public class Colaborador extends Pessoa{
	
	private int matriculaColaborador;
	private int numeroCnhMotorista;
	private String categoriaCnh;
	private String orgaoEmissorCnh;
	private Date vencimentoCnh;
	private String funcaoColaborador;
	private String foneColaborador;
	
	private Empresa empresa;
	private AutorizadorEmpresa autorizador;
	
	
	/**
	 * @return the matriculaColaborador
	 */
	public int getMatriculaColaborador() {
		return matriculaColaborador;
	}
	/**
	 * @param matriculaColaborador the matriculaColaborador to set
	 */
	public void setMatriculaColaborador(int matriculaColaborador) {
		this.matriculaColaborador = matriculaColaborador;
	}
	/**
	 * @return the numeroCnhMotorista
	 */
	public int getNumeroCnhMotorista() {
		return numeroCnhMotorista;
	}
	/**
	 * @param numeroCnhMotorista the numeroCnhMotorista to set
	 */
	public void setNumeroCnhMotorista(int numeroCnhMotorista) {
		this.numeroCnhMotorista = numeroCnhMotorista;
	}
	/**
	 * @return the categoriaCnh
	 */
	public String getCategoriaCnh() {
		return categoriaCnh;
	}
	/**
	 * @param categoriaCnh the categoriaCnh to set
	 */
	public void setCategoriaCnh(String categoriaCnh) {
		this.categoriaCnh = categoriaCnh;
	}
	/**
	 * @return the orgaoEmissorCnh
	 */
	public String getOrgaoEmissorCnh() {
		return orgaoEmissorCnh;
	}
	/**
	 * @param orgaoEmissorCnh the orgaoEmissorCnh to set
	 */
	public void setOrgaoEmissorCnh(String orgaoEmissorCnh) {
		this.orgaoEmissorCnh = orgaoEmissorCnh;
	}
	/**
	 * @return the vencimentoCnh
	 */
	public Date getVencimentoCnh() {
		return vencimentoCnh;
	}
	/**
	 * @param vencimentoCnh the vencimentoCnh to set
	 */
	public void setVencimentoCnh(Date vencimentoCnh) {
		this.vencimentoCnh = vencimentoCnh;
	}
	/**
	 * @return the funcaoColaborador
	 */
	public String getFuncaoColaborador() {
		return funcaoColaborador;
	}
	/**
	 * @param funcaoColaborador the funcaoColaborador to set
	 */
	public void setFuncaoColaborador(String funcaoColaborador) {
		this.funcaoColaborador = funcaoColaborador;
	}
	/**
	 * @return the foneColaborador
	 */
	public String getFoneColaborador() {
		return foneColaborador;
	}
	/**
	 * @param foneColaborador the foneColaborador to set
	 */
	public void setFoneColaborador(String foneColaborador) {
		this.foneColaborador = foneColaborador;
	}
	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}
	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	/**
	 * @return the autorizador
	 */
	public AutorizadorEmpresa getAutorizador() {
		return autorizador;
	}
	/**
	 * @param autorizador the autorizador to set
	 */
	public void setAutorizador(AutorizadorEmpresa autorizador) {
		this.autorizador = autorizador;
	}
	
	
	
	
}
