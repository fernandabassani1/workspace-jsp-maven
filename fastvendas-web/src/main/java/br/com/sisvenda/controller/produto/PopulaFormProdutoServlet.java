package br.com.sisvenda.controller.produto;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.model.Produto;
import br.com.sisvenda.service.ProdutoService;


@WebServlet("/populaFormProduto")
public class PopulaFormProdutoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public PopulaFormProdutoServlet() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		ProdutoService PodutoService = new ProdutoService();
		Produto produto = PodutoService.findById(Integer.parseInt(id));
		
		request.setAttribute("produtoForm", produto);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("atualizaProduto.jsp");
		dispatcher.forward(request, response);
		
	}

}
