/*
 * It is possible to write five as a sum in exactly six different ways:
 * 4 + 1
 * 3 + 2
 * 3 + 1 + 1
 * 2 + 2 + 1
 * 2 + 1 + 1 + 1
 * 1 + 1 + 1 + 1 + 1
 * 
 * How many different ways can one hundred be written as a sum of at least two positive integers?
 */

public class CountingSummations {

    public static int total = 0;

    public static void main(String[] args) {
        int n = 5;
        getFirstFormula(n);
    }

    private static void getFirstFormula(int n) {
        int[] start = {n};
        getNextFormula(start);
    }

    private static void getNextFormula(int[] formula) {
        int sum = 0;
        for (int n : formula) sum += n;
        if (sum == 5) {
            if (formula.length > 1) total++;
            if (formula[0] != 1) {
                
            }
        }
    }
    
}
