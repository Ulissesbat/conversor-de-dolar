package Aplicattion;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double quantity = sc.nextDouble();
		
		double result = CurrencyConverter.value(price, quantity);
		
		System.out.printf("Amount to be paid in reais = " + String.format("%.2f",result));
		System.out.println("Considerando imposto IOF = 6.0;");
		
		sc.close();

	}

}
