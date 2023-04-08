package Secao_10;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Quarto_hotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
		System.out.print("How many rooms will be rented? ");
		int number = sc.nextInt();
		
		for (int i=0;i<number;i++) {
			System.out.println();
			sc.nextLine();
			System.out.printf("Rent %d#\n",i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Room(name,email,room);
		}
		
		sc.nextLine();
		System.out.println("Busy rooms:");
		for (int i=0;i<vect.length;i++) {
			if (vect[i] != null) {
				System.out.printf("%d: %s, %s\n",vect[i].getRoom(),vect[i].getName(),vect[i].getEmail());
			}
		}
		//Pode-se utilizar o toString na classe e chamar com vect[i];
	
		sc.close();
	}

}
