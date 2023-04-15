package Desafios.DesafioCombate.Application;

import java.util.Scanner;

import Desafios.DesafioCombate.Entities.Champion;

public class Program {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida Inicial: ");
		int life = sc.nextInt();
		sc.nextLine();
		System.out.print("Ataque: ");
		int atk = sc.nextInt();
		sc.nextLine();
		System.out.print("Armadura: ");
		int def = sc.nextInt();
		sc.nextLine();
		
		Champion champ1 = new Champion(name, life, atk, def);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		String name2 = sc.nextLine();
		System.out.print("Vida Inicial: ");
		int life2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Ataque: ");
		int atk2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Armadura: ");
		int def2 = sc.nextInt();
		sc.nextLine();
		
		Champion champ2 = new Champion(name2, life2, atk2, def2);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for(int i = 1; i<= n; i++) {
			champ1.takeDamage(champ2);
			champ2.takeDamage(champ1);
			System.out.println("Resultado do turno " + i + ":");
			System.out.println(champ1.status());
			System.out.println(champ2.status());
			if (champ1.getLife() == 0 || champ2.getLife() == 0) {
				System.out.println();
				break;
			}
			System.out.println();
		}
		
		System.out.println("FIM DO COMBATE");

		sc.close();
	}

}
