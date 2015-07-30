package entit�s;

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
	private Integer num�ro ;
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Question> question=new HashSet<Question>();
	
	public Niveau(Long idNiveau, Integer num�ro, Set<Question> question) {
		super();
		this.idNiveau = idNiveau;
		this.num�ro = num�ro;
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


	public Integer getNum�ro() {
		return num�ro;
	}


	public void setNum�ro(Integer num�ro) {
		this.num�ro = num�ro;
	}


	public Set<Question> getQuestion() {
		return question;
	}


	public void setQuestion(Set<Question> question) {
		this.question = question;
	}
	
	
	
	
}
