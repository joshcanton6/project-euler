/*
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */

import java.math.BigDecimal;

public static void main(String[] args) {
    double power = Math.pow(2, 1000);
    String digits = new BigDecimal(power).toPlainString();
    int sum = 0;
    for (char d : digits.toCharArray()) sum += Character.getNumericValue(d);
    System.out.println(sum);
}