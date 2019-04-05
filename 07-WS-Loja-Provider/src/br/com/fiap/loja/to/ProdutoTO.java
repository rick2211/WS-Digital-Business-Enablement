package br.com.fiap.loja.to;

public class ProdutoTO {

	private int codigo;
	
	private float preco;
	
	private int quantidade;
	
	private String descricao;
	
	public ProdutoTO() {
		super();
	}

	public ProdutoTO(int codigo, float preco, int quantidade, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}