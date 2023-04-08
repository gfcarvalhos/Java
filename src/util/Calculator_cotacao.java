package util;

public class Calculator_cotacao {
	
	public static double cotacao(double dollar, double dollar_buy) {
		return dollar*dollar_buy + 0.06*dollar_buy*dollar;
	}
}
