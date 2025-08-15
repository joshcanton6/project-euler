/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which:
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        int limit = 997;
        for (int a = 1; a <= limit; a++) for (int b = a; b <= limit; b++) for (int c = b; c <= limit; c++) if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) && (a + b + c == 1000)) {
            System.out.println(a * b * c);
        }
    }

}

