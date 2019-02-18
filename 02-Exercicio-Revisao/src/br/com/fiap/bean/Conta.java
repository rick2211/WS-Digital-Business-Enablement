package br.com.fiap.bean;

import java.util.Calendar;

public abstract class Conta {

	private int agencia;
	
	private int numero;
	
	private Calendar dataAbertura;
	
	protected double saldo;
	
	public abstract double retirar(double valor) throws Exception;
	
	public double depositar(double valor) {
		return saldo += valor;
	}
	
	public Conta() {
		super();
	}

	public Conta(int agencia, int numero, Calendar dataAbertura, double saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}

