package Secao_19.Application;

import java.util.Scanner;

import Secao_19.Services.PrintService;



public class ProgramGeneric {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i =0; i<n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println();
		System.out.println("First: " + ps.first());

		sc.close();
	}

}
