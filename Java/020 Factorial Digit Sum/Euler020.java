/*
 * n! means n x (n - 1) x ... x 3 x 2 x 1.
 * For example, 10! = 10 x 9 x ... x 3 x 2 x 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!.
 */

import java.math.BigInteger;

static void main(String[] args) {
    BigInteger factorial = fact(100);
    char[] digits = factorial.toString().toCharArray();
    int sum = 0;
    for (char d : digits) {
        sum += Character.getNumericValue(d);
    }
    System.out.println(sum);
}

static BigInteger fact(int number) {
    BigInteger result = BigInteger.valueOf(1);
    for (int n = 2; n <= number; n++) {
        result = result.multiply(BigInteger.valueOf(n));
    }
    return result;
}