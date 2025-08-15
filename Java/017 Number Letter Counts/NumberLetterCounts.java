/*
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */

public class NumberLetterCounts {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) count += countLetters(i);
        System.out.println(count);
    }

    public static int countLetters(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int count = 0;
        if (digits.length >= 4) count += 11; //onethousand
        if (digits.length >= 3) {
            switch (digits[digits.length-3]) {
                case '1', '2', '6' -> count += 10; //one, two, six (hundred)
                case '4', '5', '9' -> count += 11; //four, five, nine (hundred)
                case '3', '7', '8' -> count += 12; //three, seven, eight (hundred)
            }
        }
        if (digits.length >= 2) {
            switch (digits[digits.length-2]) {
                case '1' -> {
                    switch (digits[digits.length-1]) {
                        case '0' -> count += 3; //ten
                        case '1', '2' -> count += 6; //eleven, twelve
                        case '5', '6' -> count += 7; //fifteen, sixteen
                        case '3', '4', '8', '9' -> count += 8; //thirteen, fourteen, eighteen, nineteen
                        case '7' -> count += 9; //seventeen
                    }
                }
                case '4', '5', '6' -> count += 5; //forty, fifty, sixty
                case '2', '3', '8', '9' -> count += 6; //twenty, thirty, eighty, ninety
                case '7' -> count += 7; //seventy
            }
        }
        if (digits.length == 1 || (digits.length > 1 && digits[digits.length-2] != '1')) {
            switch (digits[digits.length-1]) {
                case '1', '2', '6' -> count += 3; //one, two, six
                case '4', '5', '9' -> count += 4; //four, five, nine
                case '3', '7', '8' -> count += 5; //three, seven, eight
            }
        }
        if (digits.length > 2 && (n % 100 != 0)) count += 3; //and
        return count;
    }

}
