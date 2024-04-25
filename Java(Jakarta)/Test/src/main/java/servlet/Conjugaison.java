package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/conjugaison")
public class Conjugaison extends HttpServlet {
	private static final String VUE_CONJUGAISON = "/WEB-INF/conjugaisonForm.jsp";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(VUE_CONJUGAISON);
//		dispatcher.forward(request, response);
		
		request.setAttribute("message", "bienvenu(e) dans l'accueil");
		
		getServletContext().getRequestDispatcher(VUE_CONJUGAISON).forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String verbe = request.getParameter("verbe");
				
		if (verbe.equals(""))
		{
			response.sendRedirect("/Test/conjugaison");
		}
		else
		{
			PrintWriter out = response.getWriter();
			out.print("conjugaison du verbe : " + verbe);
		}
	}
}
