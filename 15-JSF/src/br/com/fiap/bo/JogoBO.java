package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;
import br.com.fiap.to.Jogo;

public class JogoBO {

	private static List<Jogo> lista = new ArrayList<Jogo>();
	
	public void cadastrar(Jogo jogo) {
		lista.add(jogo);
	}
	
	public List<Jogo> listar(){
		return lista;
	}
	
}
