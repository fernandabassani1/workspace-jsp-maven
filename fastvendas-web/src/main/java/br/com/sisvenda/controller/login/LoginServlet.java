package br.com.sisvenda.controller.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.sisvenda.model.Funcionario;
import br.com.sisvenda.service.FuncionarioService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
         String email = request.getParameter("email");
         String senha = request.getParameter("senha");
                  
         boolean existUsuario = new FuncionarioService().existFuncionario(email, senha);
         
         if (existUsuario) {
        	Funcionario funcionario = new FuncionarioService().findByEmailAndSenha(email, senha); 
			HttpSession session = request.getSession();
			session.setAttribute("funcionarioLogado", funcionario);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/home");
			dispatcher.forward(request, response);
		 }
//         
//         if(existUsuario == false || ){
//        	 
//         }
      
	}

}
