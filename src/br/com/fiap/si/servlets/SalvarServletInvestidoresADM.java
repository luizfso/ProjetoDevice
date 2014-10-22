package br.com.fiap.si.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.si.bean.Investidores;
import br.com.fiap.si.dao.InvestidoresDAO;

@WebServlet("/salvarInvestADM")
public class SalvarServletInvestidoresADM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SalvarServletInvestidoresADM() {
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
		String endereco = request.getParameter("txtEndereco");
		
		String voltar = request.getParameter("btnVoltar");
		
		if(voltar != null){
			pagina = "menuInvest.jsp";
		}
		else{
			
			Investidores i = new Investidores();
			i.setNome(nome);
			i.setEmail(email);
			i.setTelefone(telefone);
			i.setEndereco(endereco);
			
			InvestidoresDAO dao = new InvestidoresDAO();
			
			if(id.equals(""))
				dao.insert(i);
			else{
				i.setId(Integer.parseInt(id));
				dao.update(i);
			}
			
			ArrayList<Investidores> investidoress = (ArrayList<Investidores>) dao.getAll();
			request.setAttribute("listarInvestidores", investidoress);
			
			pagina = "listaInvestidores.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
		
	}
}
