package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_EMPRESA")
@SequenceGenerator(name="empresa", allocationSize=1,sequenceName="T_SEQ_EMPRESA")
public class Empresa {
	
	@Id
	@GeneratedValue(generator="empresa",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_empresa")
	private Integer codigo;
	@Column(name="nm_empresa", nullable=false, length= 50)
	private String nome;
	@Column(name="vl_faturamento")
	private double faturamento;
	@Column(name="ds_multinacional")
	private boolean multinacional;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getFaturamento() {
		return faturamento;
	}
	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}
	public boolean isMultinacional() {
		return multinacional;
	}
	public void setMultinacional(boolean multinacional) {
		this.multinacional = multinacional;
	}

	
}
