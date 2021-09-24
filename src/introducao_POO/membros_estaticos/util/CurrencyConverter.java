package introducao_POO.membros_estaticos.util;

public class CurrencyConverter {
	public static double priceDollar;
	public static final double taxIOF = 0.06;
	
	public static double converterDR(double qtnDollar) {
		return (priceDollar * qtnDollar) + ((priceDollar * qtnDollar) * taxIOF);
	}
	
}
