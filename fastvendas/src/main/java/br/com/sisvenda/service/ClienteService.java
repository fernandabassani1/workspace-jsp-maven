package br.com.sisvenda.service;


import java.util.List;

import br.com.sisvenda.model.Cliente;
import br.com.sisvenda.repository.ClienteRepository;

public class ClienteService {
	
	ClienteRepository repository = new ClienteRepository();
	
	/*ClienteRepository repository;*/
		
	/*public ClienteService(ClienteRepository repository) {
		this.repository = repository;
	}*/
	
	public ClienteService() {
	}

	public Cliente criarCliente(Cliente cliente){
		repository.salvarCliente(cliente);	
		return cliente;		
	}
	public List<Cliente> listaDecliente() {
		return repository.listaDecliente();	
	}

	public void delete(int id) {
		repository.delete(id);
	}
	public Cliente findById(Integer id){
		return repository.findById(id);
	}
	public void update(Cliente cliente){
		repository.update(cliente);
	}
}
