package curso_progamacao;
import java.util.Scanner;

public class Exercicio_structure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		soma = Math.pow(x, y);
		
		System.out.println("Soma = " + soma);
		sc.close();
	}

}
