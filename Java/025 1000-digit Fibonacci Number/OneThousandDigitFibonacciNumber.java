/*
 * The Fibonacci sequence is defined by the recurrence relation:
 * F(n) = F(n-1) + F(n-2), where F(1) = 1 and F(2) = 1
 * 
 * Hence the first 12 terms will be:
 * {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144}
 * 
 * The 12th term, F(12), is the first term to contain three digits.
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */

import java.math.BigInteger;
import java.util.ArrayList;

public class OneThousandDigitFibonacciNumber {

    public static ArrayList<BigInteger> sequence = new ArrayList<BigInteger>();

    public static void main(String[] args) {
        sequence.add(new BigInteger("1"));
        sequence.add(new BigInteger("1"));

        BigInteger next = sequence.getLast();
        while (String.valueOf(next).length() < 1000) {
            next = getNextFibonacciNumber();
            sequence.add(next);
        }
        System.out.println(sequence.getLast());
        System.out.println("At index: " + sequence.size());

    }

    public static BigInteger getNextFibonacciNumber() {
        BigInteger a = sequence.getLast();
        BigInteger b = sequence.get(sequence.size() - 2);
        return a.add(b);
    }
    
}
