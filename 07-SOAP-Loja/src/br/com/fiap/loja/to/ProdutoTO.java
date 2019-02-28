package br.com.fiap.loja.to;

public class ProdutoTO {

	private int codigo;
	private float preco;
	private int qtd;
	private String descricao;
	
	
	public ProdutoTO() {
		super();
	}
	public ProdutoTO(int codigo, float preco, int qtd, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.qtd = qtd;
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	


}
