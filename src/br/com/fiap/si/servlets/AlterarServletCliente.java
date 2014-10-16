package br.com.fiap.si.servlets;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.si.bean.Cliente;
import br.com.fiap.si.dao.ClienteDAO;

@WebServlet("/alterarCliente")
public class AlterarServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AlterarServletCliente() {
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
		
		ClienteDAO dao = new ClienteDAO();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		Cliente c = dao.getByPK(id);
		
		pagina = "formCliente.jsp";
		
		request.setAttribute("cliente", c);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
		
	}

}
