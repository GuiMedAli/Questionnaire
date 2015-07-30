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
public class Specialite {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idSpecialite;
	@Column(name="SPECIALITE1")
	private String Spec1 ;
	@Column(name="SPECIALITE2")
	private String Spec2 ;
	@Column(name="SPECIALITE3")
	private String Spec3 ;
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Candidat> candidat=new HashSet<Candidat>();
	
	public Specialite( String Spec1, String Spec2, String Spec3) {
		super();
		this.Spec1 = Spec1;
		this.Spec2 = Spec2;
		this.Spec3 = Spec3;
	}
	public Specialite( String Spec1, String Spec2) {
		super();
		this.Spec1 = Spec1;
		this.Spec2 = Spec2;
	}
	public Specialite( String Spec1) {
		super();
		this.Spec1 = Spec1;
	}
	public Specialite() {
		super();
	}
	
	
	
	

}
