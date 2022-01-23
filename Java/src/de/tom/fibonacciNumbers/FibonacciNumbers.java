package de.tom.fibonacciNumbers;

import java.util.Scanner;

public class FibonacciNumbers {

	
	public static void main(String[] args) {
		
		 int number = 0;

		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Please choose a not negativ integer number: ");
		 number = scanner.nextInt();
		 
		 System.out.println("The "+number+" number of the fibinacci numbers is "+ generateFibonacciNumber(number));
		 scanner.close();
		
	}
	
	private static int generateFibonacciNumber(int numberOfFibonacciSeries) {
		   if (numberOfFibonacciSeries == 0 || numberOfFibonacciSeries == 1) return numberOfFibonacciSeries;

		    return generateFibonacciNumber(numberOfFibonacciSeries - 1) + generateFibonacciNumber(numberOfFibonacciSeries - 2);
	}
	
}
