/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10,001st prime number?
 */

import java.util.ArrayList;
import java.util.Arrays;

public class TenThousandFirstPrime {

    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13));
        for (int n = primes.getLast()+2; primes.size() < 10001; n+=2) {
            if (isPrime(n, primes)) {
                primes.add(n);
            }
        }
        System.out.println(primes.getLast());
    }

    public static boolean isPrime(int n, ArrayList<Integer> primes) {
        int sqrt = (int) Math.sqrt(n);
        for (int p : primes) {
            if (p > sqrt) break;
            if (n % p == 0) return false;
        }
        return true;
    }

}

