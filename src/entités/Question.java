package entités;

import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="QUESTION")

public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_QUES")
	private Integer idQues ; 
	@Column(name="TEXT")
	private String text ;
	@Column(name="THEME")
	private String theme;
	@Column(name="NIVEAU")
	private Integer niveau;
	
	
	
	public Question( String text, String theme, Integer niveau) {
		super();
		this.text = text;
		this.theme=theme;
		this.niveau=niveau;
		
		
	}
	
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public Integer getNiveau() {
		return niveau;
	}
	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}
	public Integer getIdQues() {
		return idQues;
	}
	public void setIdQues(Integer idQues) {
		this.idQues = idQues;
	}
	public String getText() {
		return text;
	}
	public  void setText(String text) {
		this.text = text;
	}

	

	

}
