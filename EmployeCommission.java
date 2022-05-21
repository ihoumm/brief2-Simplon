package employe;

public class EmployeCommission extends Employe {
	private double salaireComission;
		
		
		public EmployeCommission(String nom, String prenom, String date, double salaireComission) {
			super(nom, prenom, date);
			this.salaireComission = salaireComission;
			
		}
	
		public Double getSalaireComission() {
			return salaireComission;
		}
	
		public void setSalaireComission(Double salaireComission) {
			this.salaireComission = salaireComission;
		}
	
		@Override
		public String toString() {
			return super.toString() +" salaireComission = "+super.employeC(salaireComission);
	}
}
