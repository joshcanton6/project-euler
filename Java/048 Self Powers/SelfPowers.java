/*
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
 * Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */

import java.math.BigInteger;

public class SelfPowers {

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1000; i++) {
            BigInteger next = (new BigInteger(String.valueOf(i))).pow(i);
            sum = sum.add(next);
        }

        String finalSum = sum.toString();
        String substr = finalSum.substring(finalSum.length() - 10);
        System.out.println(substr);
    }
    
}
