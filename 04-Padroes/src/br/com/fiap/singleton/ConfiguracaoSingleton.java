package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoSingleton {

	//1- Atributo estático que armazena o único objeto
	private static Properties props;
	
	//2- Método estático que retorna o único objeto
	public static Properties getInstance() {
		if (props == null) {
			props = new Properties();
			//carregar o objeto com as configurações do arquivo
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




