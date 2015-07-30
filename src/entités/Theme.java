package entités;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Theme {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_THEME")
	private  Integer idTheme ;
	@Column(name="NOM")
	private String nom ;
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Question> produits=new HashSet<Question>();
	
	public Theme( String nom) {
		super();
		this.nom = nom;
	}

	public Theme() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdTheme() {
		return idTheme;
	}

	public void setIdTheme(Integer idTheme) {
		this.idTheme = idTheme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
