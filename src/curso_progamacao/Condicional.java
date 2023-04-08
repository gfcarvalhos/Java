package curso_progamacao;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x<y) {
			System.out.printf("O JOGO DUROU %d HORA(S)", (x+y));
		}
		else {
			System.out.printf("O JOGO DUROU %d HORA(S)", ((24-x)+y));
		}

		sc.close();
	}

}
