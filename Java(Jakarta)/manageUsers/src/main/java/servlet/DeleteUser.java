package servlet;

import jakarta.servlet.ServletException;
import java.io.IOException;
//import beans.Utilisateur;
import dao.UtilisateurDao;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class DeleteUser
 */
@WebServlet("/suppression")
public class DeleteUser extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		if (id.matches("[0-9]+")) 
		{
			UtilisateurDao.supprimer(Integer.parseInt(id));
		} 
		response.sendRedirect("liste-utilisateurs");
	}
}
