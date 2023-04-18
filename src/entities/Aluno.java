package entities;

public class Aluno {

	String name;
	Double gradeA;
	Double gradeB;
	Double gradeC = -2.0;

	public Aluno(String name, double gradeA, double gradeB, double gradeC) {
		this.name = name;
		this.gradeA = gradeA;
		this.gradeB = gradeB;
		this.gradeC = gradeC;
	}

	public Aluno(String name, double gradeA, double gradeB) {
		this.name = name;
		this.gradeA = gradeA;
		this.gradeB = gradeB;
		this.gradeC = -1.0;
	}

	public double notaFinal() {
		if (gradeC < 0)
			return (gradeA + gradeB) / 2;
		else
			return (gradeA + gradeB + gradeC) / 3;
	}

	public String passed() {
		if (notaFinal() > 6.0)
			return ("P A S S E D - Congrats");
		else {
			return ("F A I L E D \nMissing " + (60 - notaFinal()) + " points");
		}
	}

	public String getName() {
		return this.name;
	}
	
	public boolean hasPassed() {
		return (notaFinal() > 6.0);
	}

	public String toString() {
		return "The student: " + name + " got the grades: " + gradeA + " - " + gradeB + " - " + gradeC + " and has "
				+ passed();
	}

}
