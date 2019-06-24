package br.com.sisvenda.controller.produto;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.service.ProdutoService;


@WebServlet("/excluirProduto")
public class ExcluirProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ExcluirProdutoServlet() {
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		ProdutoService service = new ProdutoService();
		
		String id = request.getParameter("id");	
		service.deletar(Integer.parseInt(id));
		
		response.sendRedirect("listaProduto");

	}

}
