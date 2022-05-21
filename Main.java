package employe;

public class Main {

	public static void main(String[] args) {
		Employe employeF = new Employe("Mustapha", "Ihoum", "1997");
		System.out.println(employeF);
		
		Employe employeC = new Employe("Mustapha", "Ihoum", "1997", calsalaire(4000));
		System.out.println(employeC);
		
		Employe employeH = new Employe("Mustapha", "Ihoum", "1997");
		System.out.println(employeH);
		
			/* TODO Auto-generated method stub
			Employe emp = new Employe("Mustapha", "Ihoum", "1997");
			
			EmployeFix empf = new EmployeFix("Mustapha", "Ihoum", "1997", 8798.90);
			
			Employe EmployeComission = new Employe("Mustapha", "Ihoum", "1997");
			EmployeCommission empC = new EmployeCommission("Mustapha", "Ihoum", "1997", 4000 + 5 * 10 );
			
			Employe EmployeHoraire = new Employe("Mustapha", "Ihoum", "1997");
			EmployeHoraire empH= new EmployeHoraire("Mustapha", "Ihoum", "1997", 180*30 );

			System.out.println(empf);
			System.out.println(empC);
			System.out.println(empH);
			*/
		}

	private static Object calsalaire(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

