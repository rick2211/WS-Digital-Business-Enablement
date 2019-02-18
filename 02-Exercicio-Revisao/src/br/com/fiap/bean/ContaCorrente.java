package br.com.fiap.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContaCorrente extends Conta {

	private TipoConta tipo;
	
	@Override
	public double retirar(double valor) throws Exception {
		if (getTipo() == TipoConta.COMUM && saldo < valor) {
			throw new Exception("Saldo insuficiente");
		}
		return saldo -=valor;
	}

	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	public ContaCorrente() {
		super();
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return 	"Agencia: " + getAgencia() + "\n" +
				"Número: " + getNumero() + "\n" +
				"Tipo: " + getTipo() + "\n" +
				"Saldo: " + getSaldo() + "\n" +
				"Data Abertura: " + 
					sdf.format(getDataAbertura().getTime()) + "\n";
 	}

}






