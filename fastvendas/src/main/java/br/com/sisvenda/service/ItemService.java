package br.com.sisvenda.service;


import br.com.sisvenda.model.Item;
import br.com.sisvenda.repository.ItemRepository;

public class ItemService {
		
	public ItemService() {
	}

	public Item criarItem(Item item){
		ItemRepository repository = new ItemRepository();
		repository.salvarItem(item);	
		return item;		
	}
//	public List<Cliente> listaDecliente() {
//		return repository.listaDecliente();	
//	}
//
//	public void delete(int id) {
//		repository.delete(id);
//	}
//	public Cliente findById(Integer id){
//		return repository.findById(id);
//	}
//	public void update(Cliente cliente){
//		repository.update(cliente);
//	}
}
