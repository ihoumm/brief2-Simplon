package employe;

public class EmployeHoraire extends Employe {

	private int salaireHoraire;

	public EmployeHoraire(String nom, String prenom, String date, int salaireHoraire ) {
		super(nom, prenom, date);
	}

	public double getSalaireHoraire() {
		return salaireHoraire;
	}

	public void setSalaireHoraire(int salaireHoraire) {
		this.salaireHoraire = salaireHoraire;
	}

	@Override
	public String toString() {
		return super.toString() +" salaireHoraire = "+super.calsalaire(salaireHoraire);
	}

}
