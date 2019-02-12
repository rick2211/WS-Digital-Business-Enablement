package br.com.fiap.revisao.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColecaoTeste {

	public static void main(String[] args) {
		//Lista
		List<String> lista = new ArrayList<String>();
		//adicionar dados na lista
		lista.add("Ola mundo");
		lista.add("Hello world");
		lista.add("Hallo Welt");
		//recuperar uma posição específica
		System.out.println(lista.get(2)); 
		//percorrer a lista
		for (String item : lista) {
			System.out.println(item);
		}
		
		System.out.println("SET");
		Set<String> set = new HashSet<>();
		//adicionar valores no set
		set.add("Lasanha");
		set.add("Lasanha");
		set.add("Pizza");
		//exibir os elementos do set
		for (String item : set) {
			System.out.println(item);
		}
		
		//MAP<Chave,Valor>
		System.out.println("MAP");
		Map<String,String> mapa = new HashMap<>(); 
		
		mapa.put("brasil", "brasilia");
		mapa.put("argentina", "buenos aires");
		mapa.put("italia", "roma");
		
		System.out.println(mapa.get("italia"));
	}
	
}








