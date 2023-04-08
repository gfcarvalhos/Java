package Secao_17.Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {

		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "C:\\\\Users\\\\gabri\\\\OneDrive\\\\Documents\\\\Cursos\\\\Java\\\\Atividades\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
