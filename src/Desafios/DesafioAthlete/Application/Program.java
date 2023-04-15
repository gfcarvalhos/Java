package Desafios.DesafioAthlete.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Desafios.DesafioAthlete.Entities.Athlete;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Athlete> athleteList = new ArrayList<>();

		System.out.print("Qual a quantidade de atletas? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Digite os dados do atleta número " + i + ":");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Sexo: ");
			char gender = genderChecker(sc);
			System.out.print("Altura: ");
			double height = heightChecker(sc);
			System.out.print("Peso: ");
			double weight = weightChecker(sc);

			athleteList.add(new Athlete(name, String.valueOf(gender), height, weight));
			
			System.out.println();
		}

		double averageWeight = athleteList.stream()
				.map(w -> w.getWeight())
				.reduce(0.0, (x, y) -> x + y) / athleteList.size();
		
		
		String higherAthleteName = athleteList.stream()
				.max((w1,w2) -> w1.getHeight().compareTo(w2.getHeight()))
				.get().getName();
		
		
		double percentOfMen = athleteList.stream()
				.filter(h -> h.getGender().equals("M"))
				.count()  / Double.valueOf(athleteList.size()) * 100;
		
		
		Double averageHeightOfWomen = athleteList.stream()
				.filter(h -> h.getGender().equals("F"))
				.mapToDouble(Athlete::getHeight)
				.average()
				.orElse(0.0);
	
		System.out.println();
		System.out.println("RELATÓRIO");
		
		System.out.println("Peso médio dos atletas: " + String.format("%.2f", averageWeight));
		System.out.println("Atleta mais alto: " + higherAthleteName);
		System.out.println("Porcentagem de homens: " + String.format("%.2f", percentOfMen) + "%");
		
		if (averageHeightOfWomen == 0.0) {
			System.out.println("Não há mulheres cadastradas.");
		}
		else {
			System.out.println("Altura média das mulheres: " + String.format("%.2f",averageHeightOfWomen));
		}
		
		sc.close();
	}

	public static Double heightChecker(Scanner sc) {

		Double height = sc.nextDouble();
		while (height <= 0.0) {
			System.out.print("Valor inválido! Favor digitar um valor positivo: ");
			height = sc.nextDouble();
		}
		return height;
	}

	public static char genderChecker(Scanner sc) {

		char gender = sc.next().charAt(0);
		while (gender != 'M' && gender != 'F') {
			System.out.print("Valor inválido! Favor digitar F ou M: ");
			gender = sc.next().charAt(0);
		}
		return gender;
	}

	public static Double weightChecker(Scanner sc) {

		double weight = sc.nextDouble();
		while (weight <= 0) {
			System.out.print("Valor invalido! Favor digitar um valor positivo: ");
			weight = sc.nextDouble();
		}
		return weight;
	}

}
