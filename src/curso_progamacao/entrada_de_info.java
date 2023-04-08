package curso_progamacao;

import java.util.Scanner;

public class entrada_de_info {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		int z;
		double y;
		x = sc.nextLine();
		z = sc.nextInt();
		y = sc.nextDouble();
		System.out.println("O nome digitado foi: " + x + z + y);
		
		sc.close();

	}

}
