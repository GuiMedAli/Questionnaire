package entités;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Utilisateur {
	
	@Id @GeneratedValue
	private Long idUtil ;
	
	@Column(name="NOM")
	private String nom ; 
	@Column(name="PRENOM")
	private String prenom ;
	@Column(name="TYPE")
	private Integer type ; 
	@Column(name="LOGIN")
	private String login;
	@Column(name="PASSWORD")
	private String password;
	
	public Utilisateur(String nom, String prenom, Integer type, String login, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.type=type ;
		this.login=login;
		this.password=password; 
	}
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdUtil() {
		return idUtil;
	}
	public void setIdUtil(Long idUtil) {
		this.idUtil = idUtil;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
