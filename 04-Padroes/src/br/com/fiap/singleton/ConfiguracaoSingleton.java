package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoSingleton {

	//1- Atributo est�tico que armazena o �nico objeto
	private static Properties props;
	
	//2- M�todo est�tico que retorna o �nico objeto
	public static Properties getInstance() {
		if (props == null) {
			props = new Properties();
			//carregar o objeto com as configura��es do arquivo
			try {
				props.load(ConfiguracaoSingleton.class
						.getResourceAsStream("/app.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return props;
	}
	
	//3- Construtor privado
	private ConfiguracaoSingleton() {}
	
}




