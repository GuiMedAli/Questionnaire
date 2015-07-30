import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entités.Utilisateur;

public class Essai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur=new Utilisateur();
		utilisateur.setNom("ali");
		utilisateur.setPrenom("med");
		utilisateur.setType(0);
		
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		session.beginTransaction();
		
		session.save(utilisateur);
		
		session.getTransaction().commit();
		session.close();
		
		
		
	}

}
