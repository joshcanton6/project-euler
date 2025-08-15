import java.util.ArrayList;

public class Euler024 {

/*
* A permutation is an ordered arrangement of objects.
* For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
* If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
* The lexicographic permutations of 0, 1 and 2 are:
* 012, 021, 102, 120, 201, 210
* What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
*/

public static ArrayList<Integer> perms = new ArrayList<Integer>();

    public static void main(String[] args) {

        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int next = getNextPermutation(digits);
        System.out.println(next);

    }

    public static int getNextPermutation(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            // 1. Find the suffix S
            // 2. Find the pivot P
            // 3. Swap P with the smallest number n in S where Sn > P
            // 4. Sort S in ascending order
        }


        return 0;
    }

}