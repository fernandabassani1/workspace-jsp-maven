
package br.com.sisvenda.service;

import java.util.List;

import br.com.sisvenda.model.Produto;
import br.com.sisvenda.repository.ProdutoRepository;

public class ProdutoService {
	
	ProdutoRepository repository = new ProdutoRepository();
	
		public Produto criarProduto(String descricao, double vlrUnitario){
		Produto produto = new Produto();
		produto.setDescricao(descricao);
		produto.setVlrUnitario(vlrUnitario);
		repository.salvarProduto(produto);
		return produto;
	}
	
	public List<Produto> listaProdutos(){
		return repository.listaProdutos();
		
	}

	public Produto findById(Integer id) {
		return repository.findById(id);
	}

	public void update(Produto produto) {
	 repository.update(produto); 
	}

	public void deletar(int id) {
		repository.delete(id);
		
	}

	
		
	
}
