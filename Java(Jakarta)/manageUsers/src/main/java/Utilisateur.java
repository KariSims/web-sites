public class Utilisateur {
    private int id;
    private String prenom;
    private String nom;
    private String email;
    private String motdepasse;
    private String conf_motdepasse;
    
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	public void setId(int id) {
		this.id = id;
	}

    // Constructeurs, getters et setters
}
