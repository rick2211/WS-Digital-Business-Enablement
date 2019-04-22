package br.com.fiap.to;

import java.util.List;

public class Jogo {

	private String nome;
	
	private String genero;
	
	private List<String> plataformas;
	
	private boolean demo;
	
	private int jogadores;
	
	private float preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isDemo() {
		return demo;
	}

	public void setDemo(boolean demo) {
		this.demo = demo;
	}

	public int getJogadores() {
		return jogadores;
	}

	public void setJogadores(int jogadores) {
		this.jogadores = jogadores;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public List<String> getPlataformas() {
		return plataformas;
	}

	public void setPlataformas(List<String> plataforma) {
		this.plataformas = plataforma;
	}
	
}