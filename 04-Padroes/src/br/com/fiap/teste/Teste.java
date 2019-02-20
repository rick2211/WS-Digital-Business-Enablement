package br.com.fiap.teste;

import org.apache.log4j.Logger;

import br.com.fiap.singleton.ConfiguracaoSingleton;

public class Teste {
	
	private static Logger log = Logger.getLogger(Teste.class);	

	public static void main(String[] args) {
		log.trace("Iniando a Aplica��o");
		//Recuperar o idioma da aplica��o
		String idioma = ConfiguracaoSingleton
					.getInstance().getProperty("idioma");
		log.info("Recuperando a configura��o de idioma");
		System.out.println(idioma);
	}
	
}



