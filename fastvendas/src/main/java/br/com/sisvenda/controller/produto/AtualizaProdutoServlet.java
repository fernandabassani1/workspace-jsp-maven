package br.com.sisvenda.controller.produto;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.model.Produto;
import br.com.sisvenda.service.ProdutoService;


@WebServlet("/atualizaProduto")
public class AtualizaProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AtualizaProdutoServlet() {
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String descricao = request.getParameter("descricao");
		String vlrUnitario = request.getParameter("vlrUnitario");
		
		Produto produto = new Produto(Integer.parseInt(id), descricao, Double.parseDouble(vlrUnitario));
		ProdutoService service = new ProdutoService();
		service.update(produto);
		
		response.sendRedirect("listaProduto");
	}

}
