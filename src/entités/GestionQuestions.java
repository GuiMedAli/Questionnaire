package entités;

import java.util.List;

public interface GestionQuestions {
	void ajouterQuestion(Question q);
	void supprimerQuestion(Integer id );
	void modifierTextQuestion(Integer id, String t);
	Question rechercheQuestion (Integer id); 
	List<Question> QuestionParNiveau(Integer n); 
	List<Question> QuestionParTheme(String t);
	void modifierThemeQuestion(Integer id , String th);
	void modifierNiveauQuestion(Integer id ,Integer n);
	
}
