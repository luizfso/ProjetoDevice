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

@WebServlet("/salvarClienteADM")
public class SalvarServletClienteADM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SalvarServletClienteADM() {
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
		
		String id = request.getParameter("id");
		String nome = request.getParameter("txtNome");
		String email = request.getParameter("txtEmail");
		String telefone = request.getParameter("txtTelefone");
		
		String voltar = request.getParameter("btnVoltar");
		
		if(voltar != null){
			pagina = "menuCli.jsp";
		}
		else{
			
			Cliente c = new Cliente();
			c.setNome(nome);
			c.setEmail(email);
			c.setTelefone(telefone);
			
			ClienteDAO dao = new ClienteDAO();
			
			if(id.equals(""))
				dao.insert(c);
			else{
				c.setId(Integer.parseInt(id));
				dao.update(c);
			}
			
			ArrayList<Cliente> clientes = (ArrayList<Cliente>) dao.getAll();
			request.setAttribute("listaCliente", clientes);
			
			pagina = "listaCliente.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
		
	}
}
