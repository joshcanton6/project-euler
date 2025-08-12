/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */


import java.util.ArrayList;

public static void main(String[] args) {
    ArrayList<Integer> primes = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7));
    for (int n = primes.getLast()+2; n < 2000000; n+=2) {
        if (isPrime(n, primes)) primes.add(n);
    }
    double sum = 0d;
    for (int p : primes) {
        sum += p;
    }
    System.out.println(String.format("%.0f", sum));
}

public static boolean isPrime(int n, ArrayList<Integer> primes) {
    int sqrt = (int) Math.sqrt(n);
    for (int p : primes) {
        if (p > sqrt) break;
        if (n % p == 0) return false;
    }
    return true;
}