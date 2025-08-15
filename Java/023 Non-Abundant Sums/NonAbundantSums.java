/*
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24.
 * By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers.
 * However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class NonAbundantSums {

    static void main(String[] args) {
        ArrayList<Integer> abundantNumbers = getAbundantNumbers(28123);
        ArrayList<Integer> sums = new ArrayList<Integer>(findPairSums(abundantNumbers));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 28123; i++) {
            if (!sums.contains(i)) list.add(i);
        }
        System.out.println(calculateListSum(list));
    }

    static ArrayList<Integer> getAbundantNumbers(int max) {
        ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
        for (int i = 1; i <= max; i++) {
            ArrayList<Integer> properDivisors = findProperDivisors(i);
            int sum = calculateListSum(properDivisors);
            if (sum > i) abundantNumbers.add(i);
        }
        return abundantNumbers;
    }

    static ArrayList<Integer> findProperDivisors(int n) {
        ArrayList<Integer> properDivisors = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i != n) properDivisors.add(i);
                if (i != n/i && n/i != n) properDivisors.add(n/i);
            }
        }
        return properDivisors;
    }

    static int calculateListSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int n : list) sum += n;
        return sum;
    }

    static Set<Integer> findPairSums(ArrayList<Integer> numbers) {
        Set<Integer> sums = new HashSet<Integer>();
        for (int a = 0; a < numbers.size(); a++) {
            for (int b = a; b < numbers.size(); b++) {
                sums.add(numbers.get(a) + numbers.get(b));
            }
        }
        return sums;
    }

}
