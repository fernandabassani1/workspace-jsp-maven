package br.com.sisvenda.controller.produto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.repository.ClienteRepository;
import br.com.sisvenda.service.ProdutoService;


@WebServlet("/cadastraProduto")
public class CadastraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String descricao = request.getParameter("descricao");
		double vlrUnitario = Double.parseDouble(request.getParameter("vlrUnitario"));
		
		ProdutoService service = new ProdutoService();
		service.criarProduto(descricao, vlrUnitario);
		
		response.sendRedirect("listaProduto");

		

	}

}
