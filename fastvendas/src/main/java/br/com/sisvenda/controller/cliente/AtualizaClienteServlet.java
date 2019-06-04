package br.com.sisvenda.controller.cliente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.model.Cliente;
import br.com.sisvenda.service.ClienteService;


@WebServlet("/atualizaCliente")
public class AtualizaClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AtualizaClienteServlet() {
 
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String sobrenome= request.getParameter("sobrenome");
		String email = request.getParameter("email");
		String documento = request.getParameter("documento");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String cep = request.getParameter("cep");
		String senha = request.getParameter("senha");

		
		
		Cliente cliente = new Cliente(Integer.parseInt(id), nome, sobrenome, email, documento, telefone, endereco, cep, senha);
		ClienteService clienteService = new ClienteService();
		clienteService.update(cliente); 
		
		response.sendRedirect("listaCliente");
	}

}
