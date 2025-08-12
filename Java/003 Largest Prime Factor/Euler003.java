/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */

 import java.util.ArrayList;

 public static void main(String[] args) {
    double number = 600851475143d;
    ArrayList<Double> primeFactors = new ArrayList<Double>();
    for (double i = 2d; i < number; i++) {
        while (number % i == 0) {
            primeFactors.add(i);
            number /= i;
        }
    }
    if (number > 2) primeFactors.add(number);
    System.out.println(primeFactors.getLast());
 }