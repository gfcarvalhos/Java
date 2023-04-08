package Secao_19.Application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Secao_19.Entities.Students;

public class ProgramSetFix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Students> set = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int n = sc.nextInt();
		
		for (int i=0; i<n;i++) {
			int x = sc.nextInt();
			sc.nextLine();
			set.add(new Students(x));
		}
		
		System.out.print("How many students for course B?");
		int m = sc.nextInt();
		
		for (int i=0; i<m;i++) {
			int x = sc.nextInt();
			sc.nextLine();
			set.add(new Students(x));
		}
		
		System.out.print("How many students for course C?");
		int o = sc.nextInt();
		
		for (int i=0; i<o;i++) {
			int x = sc.nextInt();
			sc.nextLine();
			set.add(new Students(x));
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}
