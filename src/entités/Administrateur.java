package entités;

import javax.persistence.Entity;

@Entity(name="ADMINISTRATEUR")
public class Administrateur extends Utilisateur  {

	public Administrateur(String nom, String prenom, Integer type, String login, String password) {
		super(nom, prenom, type, login, password);
		// TODO Auto-generated constructor stub
	}

	
}
