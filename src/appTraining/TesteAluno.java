package appTraining;

import java.util.Scanner;

import entities.Aluno;

public class TesteAluno {

	public static double getGrade(char gradeId, double maxValue, Scanner sc) {
		boolean exit;
		double grade;
		
		do {
			exit = true;
			System.out.printf("\nEnter Grade%s: ",gradeId);
			grade = sc.nextDouble();
			if (grade > maxValue)
			{
				System.out.println(" Maximum value = "+maxValue);
				exit = false;
			}
		}while (exit == false);
		return grade;
		
	}
	
	public static void main (String [] args) {
		
		Double gradeA, gradeB, gradeC;
		String name1;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Student   name: ");
		
		name1 = sc.nextLine();
		gradeA = getGrade('A',30,sc);
		gradeB = getGrade('B',35,sc);
		gradeC = getGrade('C',35,sc);
		Aluno testAluno = new Aluno(name1, gradeA, gradeB, gradeC);
		System.out.println(testAluno);
		
		sc.close();
		
	}
}
