package br.com.fiap.si.servlets;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.si.bean.Investidores;
import br.com.fiap.si.dao.InvestidoresDAO;

@WebServlet("/alterarInvestidores")
public class AlterarServletInvestidores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AlterarServletInvestidores() {
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
		
		InvestidoresDAO dao = new InvestidoresDAO();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		Investidores i = dao.getByPK(id);
		
		pagina = "formInvestidores.jsp";
		
		request.setAttribute("investidores", i);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
		
	}

}
