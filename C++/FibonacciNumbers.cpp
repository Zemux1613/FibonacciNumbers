#include "FibonacciNumbers.h"
#include <stdio.h>

int main() {

    int number = 0;

    printf("Please choose a not negativ integer number");

    scanf_s("%d", &number);

    printf("The %d number of the fibinacci numbers is %d", number, generateFibonacci(number));

    return 0;

}


int generateFibonacci(int numberOfFibonacciSeries) {

    if (numberOfFibonacciSeries == 0 || numberOfFibonacciSeries == 1) return numberOfFibonacciSeries;

    return generateFibonacci(numberOfFibonacciSeries - 1) + generateFibonacci(numberOfFibonacciSeries - 2);

}