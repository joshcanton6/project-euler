/*
 * The decimal number, 585 = 1001001001_2 (binary), is palindromic in both bases.
 * Find the sum of all numbers, less than one million,
 * which are palindromic in base 10 and base 2.
 */

public class DoubleBasePalindromes {

    public static int sum = 0;

    public static void main(String[] args) {
        for (int i = 1; i < 1000000; i++) {
            if (isPalindrome(i) && isBinaryPalindrome(i)) sum += i;
        }
        System.out.println(sum);
    }

    private static boolean isPalindrome(int i) {
        String forward = String.valueOf(i);
        String backward = new StringBuilder(forward).reverse().toString();
        if (forward.equals(backward)) return true;
        return false;
    }

    private static boolean isBinaryPalindrome(int i) {
        String forward = Integer.toBinaryString(i);
        String backward = new StringBuilder(forward).reverse().toString();
        if (forward.equals(backward)) return true;
        return false;
    }
    
}
