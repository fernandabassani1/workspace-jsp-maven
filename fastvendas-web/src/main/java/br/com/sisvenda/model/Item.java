package br.com.sisvenda.model;

public class Item {
	
	private Integer id;
	private Produto produto;
	private Venda venda;
	private Integer quantidade;
	
	public Item() {	}
	
		
	public Item(Integer id, Produto produto, Venda venda, Integer quantidade) {
	    this.id = id;
		this.produto = produto;
		this.venda = venda;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	

}
