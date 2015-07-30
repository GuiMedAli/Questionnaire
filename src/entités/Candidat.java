package entités;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="CANDIDAT")
public class Candidat extends Utilisateur {
	


	
	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Candidat(String nom, String prenom, Integer type, String login, String password) {
		super(nom, prenom, type, login, password);
	
	}


	

	
	
}