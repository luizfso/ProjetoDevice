package br.com.fiap.si.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.si.dao.UsuarioDAO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestHandler(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestHandler(request, response);
	}

	protected void requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pagina = "";
		
		String login = request.getParameter("txtLogin");
		String senha = request.getParameter("txtSenha");
		String voltar = request.getParameter("btnVoltar");
		
		UsuarioDAO dao = new UsuarioDAO();
		Boolean logado = dao.login(login, senha);
		
		if(voltar != null){
			pagina = "home.jsp";
		}
		else
			if(logado){
				pagina = "menu.html";}
			else{
				pagina = "erro_login.html";
		}
	
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	}
}
	
