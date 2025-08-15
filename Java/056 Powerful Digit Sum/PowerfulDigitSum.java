/*
 * A googol (10^100) is a massive number: one followed by one-hundred zeros;
 * 100^100 is almost unimaginably large: one followed by two-hundred zeros.
 * Despite their size, the sum of the digits in each number is only 1.
 * 
 * Considering natural numbers of the form, a^b, where a,b < 100,
 * what is the maximum digital sum?
 */

import java.math.BigInteger;

public class PowerfulDigitSum {

    public static void main(String[] args) {
        BigInteger highest = BigInteger.ONE;
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                BigInteger n = new BigInteger(String.valueOf(a)).pow(b);
                char[] chars = n.toString().toCharArray();
                BigInteger sum = BigInteger.ZERO;
                for (char c : chars) {
                    sum = sum.add(new BigInteger(String.valueOf(c)));
                }
                if (sum.compareTo(highest) > 0) highest = sum;
            }
        }
        System.out.println(highest.toString());
    }
}
