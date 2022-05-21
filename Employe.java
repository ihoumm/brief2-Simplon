package employe;

public class Employe {
	private String nom;
	private String prenom;
	private String date;
	
	public Employe(String nom, String prenom, String date) {
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
	}
	
	public Employe(String string, String string2, String string3, Object calsalaire) {
		// TODO Auto-generated constructor stub
	}

	public int calsalaire(int salaireHoraire) {
		return salaireHoraire;
	}
	
	public Double employeC(double employeC) {
		return employeC;
	}
	
	public Double employeF(double employeF) {
		return employeF;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "[nom=" + nom + ", prenom=" + prenom + ", date=" + date;
	}
	
}
