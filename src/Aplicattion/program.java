package Aplicattion;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("which currency do you want to calculate? ");
		System.out.println("1: American dollar ");
		System.out.println("2: Euro ");
		System.out.println("3: Pound sterling ");
		System.out.println("4: Australian Dollar ");
		System.out.println("5: yen ");
		System.out.println("6: swiss franc ");
		System.out.println("7: Canadian dollar ");
		
		int option = sc.nextInt();
		double price, quantity;
		
		 switch (option) {
         case 1:
             System.out.print("What is the American dollar price? ");
             price = sc.nextDouble();
             System.out.print("How many American dollars will be bought? ");
             quantity = sc.nextDouble();
             break;
         case 2:
             System.out.print("What is the Euro price? ");
             price = sc.nextDouble();
             System.out.print("How many Euro will be bought? ");
             quantity = sc.nextDouble();
             break;
         case 3:
             System.out.print("What is the Pound sterling price? ");
             price = sc.nextDouble();
             System.out.print("How many Pound sterling will be bought? ");
             quantity = sc.nextDouble();
             break;
         case 4:
             System.out.print("What is the Australian dollar price? ");
             price = sc.nextDouble();
             System.out.print("How many Australian dollars will be bought? ");
             quantity = sc.nextDouble();
             break;
         case 5:
             System.out.print("What is the yen price? ");
             price = sc.nextDouble();
             System.out.print("How many yen will be bought? ");
             quantity = sc.nextDouble();
             break;
         case 6:
             System.out.print("What is the Swiss franc price? ");
             price = sc.nextDouble();
             System.out.print("How many Swiss francs will be bought? ");
             quantity = sc.nextDouble();
             break;
         case 7:
             System.out.print("What is the Canadian dollar price? ");
             price = sc.nextDouble();
             System.out.print("How many Canadian dollars will be bought? ");
             quantity = sc.nextDouble();
             break;
         default:
             System.out.println("Invalid option");
             sc.close();
             return;
     }

	        double result = CurrencyConverter.value(price, quantity);
	        System.out.printf("Amount to be paid in reais = %.2f\n", result);
	        System.out.println("Considering IOF tax = 1.1%");
		
		sc.close();

	}

}
