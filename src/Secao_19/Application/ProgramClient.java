package Secao_19.Application;

import Secao_19.Entities.Client;

public class ProgramClient {
	
	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("João", "jJoao@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		
	}


}
