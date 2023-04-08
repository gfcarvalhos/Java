package Secao_19.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Secao_19.Entities.logEntry;

public class ProgramSetEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\gabri\\OneDrive\\Documents\\Cursos\\Java\\Atividades\\in3.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			 
			Set<logEntry> set = new HashSet<>();
			
			String line = br.readLine();
			
			while(line!= null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new logEntry(username, moment));
				
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();
	}
}
