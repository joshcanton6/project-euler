/*
 * It is well known that if the square root of a natural number is not an integer, then it is irrational.
 * The decimal expansion of such square roots is infinite without any repeating pattern at all.
 * The square root of two is 1.41421356237309504880..., and the digital sum of the first one hundred decimal digits is 475.
 * For the first one hundred natural numbers,
 * find the total of the digital sums of the first one hundred decimal digits for all the irrational square roots.
 */

import java.math.BigDecimal;
import java.math.MathContext;

public class SquareRootDigitalExpansion {

    public static int sum = 0;

    public static void main(String[] args) {
        for (Double d = 1.0; d <= 100.0; d++) {
            if (!(Math.sqrt(d) % 1 == 0)) {
                BigDecimal decimal = new BigDecimal(d);
                MathContext context = new MathContext(110);
                BigDecimal square = decimal.sqrt(context);
                char[] digits = square.toString()
                    .replace(".", "")
                    .substring(0, 100)
                    .toCharArray();
                for (char c : digits) sum += Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
    }
    
}
