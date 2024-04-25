import java.util.List;

public class UtilisateurController {
    private UtilisateurDAO utilisateurDao;

    public UtilisateurController() {
        this.utilisateurDao = new UtilisateurDAO(); // Initialisation de l'accès à la base de données
    }

    // Méthode pour récupérer tous les utilisateurs
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurDao.getAllUtilisateurs();
    }

    // Méthode pour récupérer un utilisateur par son ID
    public Utilisateur getUtilisateurById(int id) {
        return utilisateurDao.getUtilisateurById(id);
    }

    // Méthode pour ajouter un nouvel utilisateur
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurDao.ajouterUtilisateur(utilisateur);
    }

    // Méthode pour mettre à jour un utilisateur existant
    public void mettreAJourUtilisateur(Utilisateur utilisateur) {
        utilisateurDao.mettreAJourUtilisateur(utilisateur);
    }

    // Méthode pour supprimer un utilisateur
    public void supprimerUtilisateur(int id) {
        utilisateurDao.supprimerUtilisateur(id);
    }
}
