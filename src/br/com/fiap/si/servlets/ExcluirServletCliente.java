package br.com.fiap.si.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.si.bean.Cliente;
import br.com.fiap.si.dao.ClienteDAO;

@WebServlet("/excluirCliente")
public class ExcluirServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirServletCliente() {
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
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		ClienteDAO dao = new ClienteDAO();
		
		dao.delete(id);
		
		ArrayList<Cliente> clientes = (ArrayList<Cliente>) dao.getAll();
		request.setAttribute("listaCliente", clientes);
		
		pagina = "listaCliente.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	}

}
