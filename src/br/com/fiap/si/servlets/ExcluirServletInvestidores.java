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

@WebServlet("/excluirInvestidores")
public class ExcluirServletInvestidores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirServletInvestidores() {
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
		
		InvestidoresDAO dao = new InvestidoresDAO();
		
		dao.delete(id);
		
		ArrayList<Investidores> investidoress = (ArrayList<Investidores>) dao.getAll();
		request.setAttribute("listarInvestidores", investidoress);
		
		pagina = "listaInvestidores.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	}

}
