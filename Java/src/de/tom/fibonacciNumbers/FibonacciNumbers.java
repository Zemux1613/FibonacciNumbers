package de.tom.fibonacciNumbers;

import java.util.Scanner;

public class FibonacciNumbers {


	public static void main(String[] args) {

		int number = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please choose a not negativ integer number: ");
		number = scanner.nextInt();

		System.out.println("The "+number+" number of the fibinacci numbers is "+ generateFibonacciNumber(number));
		System.out.println("The "+number+" number of the fibinacci numbers is "+ generateExplicidFibonacci(number));
		System.out.println("The aproximation on the golden ratio is " + goldenRatio(number));
		scanner.close();

	}

	private static long generateFibonacciNumber(int numberOfFibonacciSeries) {
		if (numberOfFibonacciSeries == 0 || numberOfFibonacciSeries == 1) return numberOfFibonacciSeries;

		return generateFibonacciNumber(numberOfFibonacciSeries - 1) + generateFibonacciNumber(numberOfFibonacciSeries - 2);
	}

	private static double generateExplicidFibonacci(int numberOfFibonacciSeries) {

		double x = 1 / Math.sqrt(5);
		double y = Math.pow(((1 + Math.sqrt(5)) / 2), numberOfFibonacciSeries);
		double z = Math.pow(((1 - Math.sqrt(5)) / 2), numberOfFibonacciSeries);

		return x * (y - z);

	}

	private static double goldenRatio(int numberOfFibonacciSeries) {

		return (1.0*generateExplicidFibonacci(numberOfFibonacciSeries)) / generateExplicidFibonacci(numberOfFibonacciSeries-1);

	}

}
