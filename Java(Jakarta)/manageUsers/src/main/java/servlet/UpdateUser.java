package servlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import beans.Utilisateur;
import dao.UtilisateurDao;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/modification")

public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String UPDATE_USER_VIEW = "/WEB-INF/modifierUtilisateur.jsp";
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		if(id.matches("[0-9]+"))
		{
			Utilisateur utilisateur = UtilisateurDao.get(Integer.parseInt(id));
		    
			if (utilisateur != null) {
		    	
		    	request.setAttribute("utilisateur", utilisateur);
				getServletContext().getRequestDispatcher(UPDATE_USER_VIEW).forward(request, response);
			    return;
			}	
		}
			response.sendRedirect("liste-utilisateurs");
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String password = request.getParameter("password");
		
		Utilisateur utilisateur = new Utilisateur (Integer.parseInt(id),nom, prenom, password);
		
		if (UtilisateurDao.modifier(utilisateur)) {
			
			response.sendRedirect("liste-utilisateurs");
		} else {
			response.sendRedirect("update?id= " + id);
		}
	}

}
