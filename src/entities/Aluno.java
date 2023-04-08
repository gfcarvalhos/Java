package entities;

public class Aluno {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	
	public double FinalGrade() {
		return n1+n2+n3;
	}
	
	public void Situation() {
		double m = n1+n2+n3;
		if (m>=60) {
			System.out.println("PASSED");
		}
		else {
			m = 60 - (n1+n2+n3);
			System.out.println("FAILED");
			System.out.printf("MISSING " + String.format("%.2f", m) + " POINTS");
		}
	}
}
