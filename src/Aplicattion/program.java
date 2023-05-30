package Aplicattion;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		double result = CurrencyConverter.value(price, quantity);
		
		System.out.printf("Amount to be paid in reais = " + String.format("%.2f \n",result));
		System.out.println("Considering IOF tax = 6.0");
		
		sc.close();

	}

}
