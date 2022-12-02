package cours;

public class Revision {

	protected String nom,prenom;
	protected double salaire;
	protected int cni;
	
	public Revision() { 
		nom=" ";
		prenom=" ";
		salaire=0.0;
		cni=0;
	}
	
	public Revision(int a) { 
		this.cni=a;
	}
	public Revision(String nom,String prenom) { 
		this.nom=nom;
		this.prenom=prenom;
	}
	public Revision(String nom,String prenom,double s,int a) { 
		this.nom=nom;
		this.prenom=prenom;
		this.salaire=s;
		this.cni=a;
	}
	
	public void show(){
		System.out.println("je suis un etudiant");
	}
}
