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

import br.com.fiap.si.bean.Investidores;
import br.com.fiap.si.dao.InvestidoresDAO;

@SuppressWarnings("unused")
@WebServlet("/listarInvestidores")
public class ListaServletInvestidores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListaServletInvestidores() {
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
		 ArrayList<Investidores> investidoress = null;
		 InvestidoresDAO dao = new InvestidoresDAO();
		 
	//	System.out.println(voltar);

		if(voltar != null){
			pagina = "menuInvest.jsp";
		}else{
			pagina = "listaInvestidores.jsp";
    	}	

		
			investidoress = (ArrayList<Investidores>)dao.getByNomeEmail( request.getParameter("txtNome") , request.getParameter("txtEmail"));

		
			request.setAttribute("listarInvestidores", investidoress);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
			}
		
}