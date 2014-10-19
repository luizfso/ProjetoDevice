package br.com.fiap.si.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.si.bean.Cliente;
import br.com.fiap.si.dao.ClienteDAO;

@SuppressWarnings("unused")
@WebServlet("/listarClientes")
public class ListaServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListaServletCliente() {
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
		
		String voltar = request.getParameter("btnVoltar");
		
		String buscar = request.getParameter("buscar");
		
		if(voltar != null){
			pagina = "menuCli.jsp";
		}
		else{
			pagina = "listaCliente.jsp";
			
			ClienteDAO dao = new ClienteDAO();
		
			ArrayList<Cliente> clientes = null;
			
			if(buscar != null){
				String nome = request.getParameter("txtNome");

				clientes = (ArrayList<Cliente>)dao.getByNome(nome);
				}
			else
				clientes = (ArrayList<Cliente>)dao.getAll();
		
			request.setAttribute("listaCliente", clientes);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
		
	}

}
