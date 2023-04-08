package Secao_19.Application;

import java.util.Arrays;
import java.util.List;

public class ProgramCuringa {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
		
	}
	
	public static void printList(List<?> list) {
		//list.add(3)  não consegue adicionar pois o compilador nao sabe qual tipo é a list
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
