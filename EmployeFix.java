package employe;

public class EmployeFix extends Employe {

	public EmployeFix(String nom, String prenom, String date) {
		super(nom, prenom, date);
		// TODO Auto-generated constructor stub
	}

	private Double salaire;

	/**
	 * @param nom
	 * @param prenom
	 * @param date
	 * @param salaire
	 */
	public EmployeFix(String nom, String prenom, String date, Double salaire) {
		super(nom, prenom, date);
		this.salaire = salaire;
	}

	public EmployeFix(String nom, String prenom, String date, double salaire2) {
		// TODO Auto-generated constructor stub
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return super.toString() +" salaire = "+super.employeF(salaire);
	}

}
