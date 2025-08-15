import java.math.BigInteger;

public class Euler028 {

    /*
     * Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
     * 
     * 21 22 23 24 25
     * 20  7  8  9 10
     * 19  6  1  2 11
     * 18  5  4  3 12
     * 17 16 15 14 13
     * 
     * It can be verified that the sum of the numbers on the diagonals is 101.
     * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
     */

    public static void main(String[] args) {
        BigInteger n = BigInteger.ONE;
        BigInteger sum = BigInteger.ONE; // the running total
        int iteration = 1; // how many times something was added
        BigInteger jump = BigInteger.TWO; // how much is added each time // the space between corners
        BigInteger limit = new BigInteger("1001"); // maximum dimensions of square

        while (jump.compareTo(limit) < 0) { // go until the square is 1001 x 1001
            n = n.add(jump); // the next number in the sequence
            sum = sum.add(n); // increase sum by n
            iteration++;
            if (iteration % 4 == 0) { // after 4 adds, completing those corners...
                jump = jump.add(BigInteger.TWO); // ...increase jump by two
            }
        }

        System.out.println(sum.toString());
        
    }

}