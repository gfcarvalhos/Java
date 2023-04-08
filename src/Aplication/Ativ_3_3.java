package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Ativ_3_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.name = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.println("Final Grades = " + aluno.FinalGrade());
		aluno.Situation();
		
		sc.close();
	}

}
