package Secao_19.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProgramMap {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\gabri\\OneDrive\\Documents\\Cursos\\Java\\Atividades\\votacao.txt";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			Map<String, Integer> map = new HashMap<>();
			
			while(line != null) {
				
				String[] fields = line.split(",");
				String username = fields[0];
				Integer voteQnt = Integer.parseInt(fields[1]);
				
				if(map.containsKey(username)) {
					
					map.put(username, map.get(username) + voteQnt);
				}
				else {
					
					map.put(username, voteQnt);
			
				}
				
				line = br.readLine();
			}
			
			for(String key : map.keySet()) {
				System.out.println(key + " : " + map.get(key));
			}
			
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
