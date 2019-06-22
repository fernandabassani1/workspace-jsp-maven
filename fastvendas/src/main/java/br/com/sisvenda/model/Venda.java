package br.com.sisvenda.model;

import java.util.Date;

public class Venda {
	
	private Integer id;
	private Cliente cliente;
	private Funcionario funcionario;
	private Date data;
	private double total;
	
	public Venda() {}
	
	public Venda(Integer id) {
		this.id = id;
	}

	public Venda(Integer id, Cliente cliente, Funcionario funcionario, Date data, double total) {
		this.id = id;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.data = data;
		this.total = total;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}
	
	

		
}
