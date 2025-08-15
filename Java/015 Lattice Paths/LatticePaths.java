/*
 * Starting in the top left corner of a 2 x 2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20 x 20 grid?
 */

public class LatticePaths {

    public static void main(String[] args) {
        int totalMoves = 40;
        int upOrDownMoves = 20;
        double routes = fact(totalMoves)/(fact(upOrDownMoves)*fact(totalMoves-upOrDownMoves));
        System.out.println(String.format("%.0f", routes));
    }

    public static double fact(int n) {
        double fact = 1;
        for (double i = 1; i <= n; i++) fact *= i;
        return fact;
    }

}

