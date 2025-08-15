/*
 * The sum of the squares of the first ten natural numbers is:
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is:
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is:
 * 3025 - 385 = 2640
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class SumSquareDifference {

    public static void main(String[] args) {
        double sumOfSquares = sumOfSquares(100d);
        double squareOfSum = squareOfSum(100d);
        System.out.printf("%.0f\n", squareOfSum - sumOfSquares);
    }

    public static double sumOfSquares(double max) {
        double sum = 0d;
        for (double i = 1d; i <= max; i++) sum += Math.pow(i, 2d);
        return sum;
    }

    public static double squareOfSum(double max) {
        double sum = 0;
        for (double i = 1; i <= max; i++) sum += i;
        return Math.pow(sum, 2);
    }

}

