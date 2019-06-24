package br.com.sisvenda.service;

import java.util.List;

import br.com.sisvenda.model.Funcionario;
import br.com.sisvenda.repository.FuncionarioRepository;

public class FuncionarioService {

	public Funcionario criarFuncionario(String nome, String email, String rg) {
		FuncionarioRepository repository = new FuncionarioRepository();
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setEmail(email);
		funcionario.setRg(rg);
		repository.salvarFuncionario(funcionario);
		return funcionario;
	}
	
	public Funcionario findByEmailAndSenha(String email, String senha){
		FuncionarioRepository repository = new FuncionarioRepository();
		return repository.findByEmailAndSenha(email, senha);
	}

	public List<Funcionario> listaDeFuncionario() {
		FuncionarioRepository repository = new FuncionarioRepository();
		return repository.listaDeFuncionario();
	}

	public boolean existFuncionario(String email, String senha) {
		FuncionarioRepository repository = new FuncionarioRepository();
		int countFuncionario = repository.countFuncionario(email, senha);

		if (countFuncionario == 1)
			return true;
		return false;
	}
		
}
