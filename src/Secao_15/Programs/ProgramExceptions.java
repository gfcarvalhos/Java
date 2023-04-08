package Secao_15.Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramExceptions {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program.");
		
	}
	public static void method1(){
		System.out.println("****METHOD1 START****");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vec = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vec[position]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}
		
		catch(InputMismatchException e) {
			System.out.println("Input error.");
		}
		sc.close();
		System.out.println("****METHOD1 END****");
	}

}
