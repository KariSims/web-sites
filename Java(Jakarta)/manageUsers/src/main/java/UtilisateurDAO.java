import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/utilisateurs")
public class UtilisateurDAO {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/users_jstl";
    private String username = "nom_utilisateur";
    private String password = "mot_de_passe";

    // Méthode pour récupérer tous les utilisateurs depuis la base de données
    public List<Utilisateur> getAllUtilisateurs() {
        List<Utilisateur> utilisateurs = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
             PreparedStatement statement = conn.prepareStatement("SELECT * FROM utilisateurs");
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setId(resultSet.getInt("id"));
                utilisateur.setPrenom(resultSet.getString("prenom"));
                utilisateur.setNom(resultSet.getString("nom"));
                utilisateur.setEmail(resultSet.getString("email"));
                utilisateurs.add(utilisateur);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return utilisateurs;
    }

	public Utilisateur getUtilisateurById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

    // Autres méthodes pour CRUD : getUtilisateurById, ajouterUtilisateur, mettreAJourUtilisateur, supprimerUtilisateur
}
