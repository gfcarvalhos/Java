package Secao_10;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique a quantidade de linhas e de colunas, respectivamente:");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] matriz = new int[n][m];
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		sc.nextLine();
		System.out.print("Indique o número: ");
		int numero = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if (matriz[i][j] == numero) {
					System.out.println("Position " + i + "," + j);
					if(j-1>=0) System.out.println("Left: " + matriz[i][j-1]);
					if(j+1<m) System.out.println("Right: " + matriz[i][j+1]);
					if(i-1>=0) System.out.println("Up: " + matriz[i-1][j]);
					if(i+1<n) System.out.println("Down: " + matriz[i+1][j]);
					continue;
				}
			}
		}
		
		sc.close();
	}

}
