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
import br.com.fiap.si.bean.Investidores;
import br.com.fiap.si.dao.ClienteDAO;
import br.com.fiap.si.dao.InvestidoresDAO;

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
		String buscar = request.getParameter("btnBuscar");
		 ArrayList<Cliente> clientes = null;
		ClienteDAO dao = new ClienteDAO();
		 
	//	System.out.println(voltar);

		if(voltar != null){
			pagina = "menuCli.jsp";
		}else{
			pagina = "listaCliente.jsp";
    	}	
 
		clientes = (ArrayList<Cliente>)dao.getByNomeEmail(request.getParameter("txtNome") , request.getParameter("txtEmail"));

		
		request.setAttribute("listaCliente", clientes);
	
	
	RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
	dispatcher.forward(request, response);
		}
	
}







