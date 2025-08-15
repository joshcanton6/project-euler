/*
 * In the 5 by 5 matrix below, the minimal path sum from the top left to the bottom right,
 * by only moving to the right and down, is indicated in bold red and is equal to 2427.
 * 
 * 131, 673, 234, 103, 18
 * 201, 96,  342, 965, 150
 * 630, 803, 746, 422, 111
 * 537, 699, 497, 121, 956
 * 805, 732, 524, 37,  331
 * 
 * Find the minimal path sum from the top left to the bottom right by only moving right and down in "matrix.txt".
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class PathSumTwoWays {

    public static int sum = 0;
    public static int[][] matrix = new int[80][80];
    
    public static void main(String[] args) {
        getMatrix();
        goToNext(0, 0);
        System.out.println(sum);
    }

    private static void goToNext(int r, int c) {
        sum += matrix[r][c];
        
    }

    private static void getMatrix() {
        try (BufferedReader br = new BufferedReader(new FileReader("matrix.txt"))) {
            String line;
            for (int i = 0; (line = br.readLine()) != null; i++) {
                String[] s = line.split(",");
                for (int j = 0; j < s.length; j++) {
                    matrix[i][j] = Integer.parseInt(s[j]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
