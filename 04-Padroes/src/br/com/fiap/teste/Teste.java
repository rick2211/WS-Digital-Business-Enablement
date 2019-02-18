package br.com.fiap.teste;

import br.com.fiap.singleton.ConfiguracaoSingleton;

public class Teste {

	public static void main(String[] args) {
		//Recuperar o idioma da aplicação
		String idioma = ConfiguracaoSingleton
					.getInstance().getProperty("idioma");
		System.out.println(idioma);
	}
	
}



