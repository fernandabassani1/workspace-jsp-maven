package br.com.sisvenda.controller.cliente;

import br.com.sisvenda.model.Item;
import br.com.sisvenda.model.Produto;
import br.com.sisvenda.model.Venda;
import br.com.sisvenda.service.ItemService;

public class Teste {

	public static void main(String[] args) {
		ItemService service = new ItemService();
		Item item = new Item(null, new Produto(1), new Venda(2), 1);
		service.criarItem(item);
		System.out.println("med");

	}

}
