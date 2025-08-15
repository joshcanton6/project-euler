/*
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 x 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

import java.util.ArrayList;

public class LargestPalindromeProduct {

    public static void main(String[] args) {
        ArrayList<Integer> palindromics = new ArrayList<Integer>();
        for (int x  = 999; x >= 100; x--) {
            for (int y = 100; y <= x; y++) {
                int sum = x * y;
                String sumForwards = Integer.toString(sum);
                String sumBackwards = reverseString(sumForwards);
                if (sumBackwards.equals(sumForwards)) palindromics.add(sum);
            }
        }
        int highest = 0;
        for (int n : palindromics) if (n > highest) highest = n;
        System.out.println(highest);
    }

    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length()-1; i >= 0; i--) r += s.charAt(i);
        return r;
    }

}