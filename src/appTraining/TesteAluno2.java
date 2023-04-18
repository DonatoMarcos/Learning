package appTraining;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class TesteAluno2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double auxGradeA, auxGradeB;
		String auxName;

		System.out.print("Indicate number of elements in the group: ");
		Aluno[] alunos = new Aluno[sc.nextInt()];

		for (int i = 0; i < alunos.length; i++) {
			sc.nextLine();
			System.out.print("\nStudent Name: ");
			auxName = sc.nextLine();
			System.out.printf("Student grade-a: ");
			auxGradeA = sc.nextDouble();
			System.out.printf("Student grade-b: ");
			auxGradeB = sc.nextDouble();
			alunos[i] = new Aluno(auxName, auxGradeA, auxGradeB);
		}

		String approvedStudents = "";

		for (Aluno alunoTemp : alunos) {
			if (alunoTemp.hasPassed())
				approvedStudents = approvedStudents + alunoTemp.getName() + " ,";
		}
		System.out.println("\nApproved Students: " + approvedStudents.substring(0, approvedStudents.length() - 2));
		sc.close();

	}
}