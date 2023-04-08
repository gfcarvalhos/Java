package curso_progamacao;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 10.35784;
		System.out.println("O resultado de x é " + x);
		System.out.printf("Teste " + "%.2f%n", x);
		System.out.printf("Teste " + "%.1f%n", x);
		Locale.setDefault(Locale.US);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
