/*
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
 * The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * Evaluate the sum of all the amicable numbers under 10000.
 */

import java.util.ArrayList;

public class AmicableNumbers {

    static void main(String[] args) {
        ArrayList<Integer> amicableNumbers = new ArrayList<Integer>();
        for (int a = 1; a < 10000; a++) {
            int b = d(a);
            if (a != b && d(b) == a && !amicableNumbers.contains(a) && !amicableNumbers.contains(b)) {
                amicableNumbers.add(a);
                amicableNumbers.add(b);
            }
        }
        System.out.println(findSumOfListMembers(amicableNumbers));
    }

    static ArrayList<Integer> getDivisors(int number) {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                if (i != number/i && i != 1) divisors.add(number/i);
            }
        }
        return divisors;
    }

    static int findSumOfListMembers(ArrayList<Integer> divisors) {
        int sum = 0;
        for (Integer n : divisors) sum += n;
        return sum;
    }

    static int d(int n) {
        ArrayList<Integer> divisors = getDivisors(n);
        return findSumOfListMembers(divisors);
    }

}
