#include "FibonacciNumbers.h"
#include <stdio.h>
#include <Math.h>

int main() {

    int number = 0;

    printf("Please choose a not negativ integer number\n");

    scanf_s("%d", &number);

    printf("The %d number of the fibinacci numbers is %d\n", number, generateExplicidFibonacci(number));
    printf("The %d number of the fibinacci numbers is %d\n", number, generateFibonacci(number));
    
    return 0;

}

long long generateExplicidFibonacci(int numberOfFibonacciSeries) {

    double x = 1 / sqrt(5);
    double y = pow(((1 + sqrt(5)) / 2), numberOfFibonacciSeries);
    double z = pow(((1 - sqrt(5)) / 2), numberOfFibonacciSeries);

    return x * (y - z);

}

long long generateFibonacci(int numberOfFibonacciSeries) {

    if (numberOfFibonacciSeries == 0 || numberOfFibonacciSeries == 1) return numberOfFibonacciSeries;

    return generateFibonacci(numberOfFibonacciSeries - 1) + generateFibonacci(numberOfFibonacciSeries - 2);

}
