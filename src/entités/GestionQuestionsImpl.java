
package entités;

import java.util.ArrayList;
import java.util.List;

public class GestionQuestionsImpl implements GestionQuestions {
	
	private List<Question> questions=new  ArrayList<Question>() ; 
	@Override
	public void ajouterQuestion(Question q) {
		// TODO Auto-generated method stub
		q.setIdQues(questions.size()+1 );
		questions.add(q);
	}

	@Override
	public void supprimerQuestion(Integer id) {
		// TODO Auto-generated method stub
		questions.remove(rechercheQuestion(id));

	}


	

	@Override
	public void modifierTextQuestion(Integer id, String t) {
		// TODO Auto-generated method stub
		((GestionQuestionsImpl) questions).rechercheQuestion(id).setText(t);
	}
	@Override
	public Question rechercheQuestion(Integer i) {
		// TODO Auto-generated method stub
		Question ques=null ;
		for (Question q:questions)
		{
			if(q.getIdQues().equals(i))
			{
				ques=q ; 
			}
			break ;
		}
		return ques ;
	}
	
	
	public List<Question> QuestionParNiveau(Integer n) {
		// TODO Auto-generated method stub
		List<Question> q=new ArrayList<Question>();
		for (Question qu:questions)
		{
			if( qu.getNiveau().equals(n))
			{
				q.add(qu);
			}
		}
		return q;
	}
	public void modifierThemeQuestion(Integer id, String th) {
		// TODO Auto-generated method stub
		
		((GestionQuestionsImpl) questions).rechercheQuestion(id).setTheme(th);
		
		
	}
	public void modifierNiveauQuestion(Integer id, Integer n) {
		// TODO Auto-generated method stub
		((GestionQuestionsImpl) questions).rechercheQuestion(id).setNiveau(n); 
	}
	

	@Override
	public List<Question> QuestionParTheme(String t) {
		// TODO Auto-generated method stub
		List<Question> q=new ArrayList<Question>();
		for (Question qu:questions)
		{
			if( qu.getTheme().equals(t))
			{
				q.add(qu);
			}
		}
		return q;	}


}
