/*
 * Consider the divisors of 30: 1, 2, 3, 5, 6, 10, 15, 30.
 * It can be seen that for every divisor d of 30, d+30/d is prime.
 * 
 * Find the sum of all positive integers n not exceeding 100,000,000
 * such that for every divisor d of n, d+n/d is prime.
 */

import java.util.ArrayList;

public class PrimeGeneratingIntegers {

    public static int sum = 0;

    public static void main(String[] args) {
        for (int n = 1; n < 100000000; n++) {
            ArrayList<Integer> divisors = getDivisors(n);
        }
    }

    private static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n/i) divisors.add(n/i);
            }
        }
        return divisors;
    }
    
}
