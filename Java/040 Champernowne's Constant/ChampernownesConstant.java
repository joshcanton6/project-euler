/*
 * An irrational decimal fraction is created by concatenating the positive integers:
 * 0.123456789101112131415161718192021...
 * 
 * It can be seen that the 12th digit of the fractional part is 1.
 * If d_n represents the nth digit of the fractional part, find the value of the following expression.
 * d_1 x d_10 x d_100 x d_1000 x d_10000 x d_100000 x d_1000000
 */

public class ChampernownesConstant {

    public static void main(String[] args) {
        char[] fractional = buildDecimalString(1000000);
        int product = 1;
        for (int i = 1; i < 1000000; i *= 10) {
            product *= Character.getNumericValue(fractional[i]);
        }
        System.out.println(product);
    }

    public static char[] buildDecimalString(int length) {
        String decimalString = "";
        for (int i = 1; decimalString.length() < length; i++) decimalString += i;
        decimalString = "." + decimalString;
        return decimalString.toCharArray();
    }

}