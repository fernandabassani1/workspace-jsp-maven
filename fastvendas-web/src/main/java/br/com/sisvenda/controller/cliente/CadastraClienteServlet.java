package br.com.sisvenda.controller.cliente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.sisvenda.model.Cliente;
import br.com.sisvenda.service.ClienteService;


@WebServlet("/cadastraCliente")
public class CadastraClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
  public CadastraClienteServlet() {
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// trazer um objeto do html  no getParamiter
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String email = request.getParameter("email");
		String documento = request.getParameter("documento");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String cep = request.getParameter("cep");
		String senha = request.getParameter("senha");
		
	
		//instanciar o servico de cliente e chamar o criarCliente, passando o atributo no parametro.
		
		ClienteService service = new ClienteService();
		service.criarCliente(new Cliente(null,nome, sobrenome, email, documento, telefone, endereco, cep, senha));
				
		response.sendRedirect("listaCliente");
		
		
	}

}
