package introducao_POO.membros_estaticos.application;

import java.util.Locale;
import java.util.Scanner;

import introducao_POO.membros_estaticos.util.CurrencyConverter;

public class ConverterDR {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		CurrencyConverter.priceDollar = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converterDR(sc.nextDouble()));
		
		sc.close();
	}
}
