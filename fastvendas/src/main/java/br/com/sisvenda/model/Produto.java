package br.com.sisvenda.model;

public class Produto {
	
	private Integer	id;
	private String descricao;
	private double vlrUnitario;
	
	public Produto() {}
	
	public Produto(Integer id, String descricao, double vlrUnitario) {
		this.id = id;
		this.descricao = descricao;
		this.vlrUnitario = vlrUnitario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getVlrUnitario() {
		return vlrUnitario;
	}

	public void setVlrUnitario(double vlrUnitario) {
		this.vlrUnitario = vlrUnitario;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", vlrUnitario=" + vlrUnitario + "]";
	}
	
	
	
	

}
