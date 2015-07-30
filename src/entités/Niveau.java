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

@Entity
public class Niveau {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idNiveau;
	@Column(name="NUMERO")
	private Integer numéro ;
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Question> question=new HashSet<Question>();
	
	public Niveau(Long idNiveau, Integer numéro, Set<Question> question) {
		super();
		this.idNiveau = idNiveau;
		this.numéro = numéro;
		this.question = question;
	}

	
	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getIdNiveau() {
		return idNiveau;
	}


	public void setIdNiveau(Long idNiveau) {
		this.idNiveau = idNiveau;
	}


	public Integer getNuméro() {
		return numéro;
	}


	public void setNuméro(Integer numéro) {
		this.numéro = numéro;
	}


	public Set<Question> getQuestion() {
		return question;
	}


	public void setQuestion(Set<Question> question) {
		this.question = question;
	}
	
	
	
	
}
