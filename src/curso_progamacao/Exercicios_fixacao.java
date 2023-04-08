package curso_progamacao;
import java.util.Locale;
public class Exercicios_fixacao {

	public static void main(String[] args) {
		int x,y,age,code;
		double resultado, price1,price2,measure;
		x = 5;
		y = 2;
		resultado = (double) x/y;
		System.out.print(resultado);
		
		String product1, product2;
		product1 = "Computer";
		product2 = "Office desk";
		age = 30;
		code = 5290;
		char gender = 'F';
		price1 = 2100.00;
		price2 = 650.50;
		measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %f%n", product1,price1);
		System.out.printf("%s, which price is $ %f %n%n", product2,price2);
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age,code,gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	

	}

}
