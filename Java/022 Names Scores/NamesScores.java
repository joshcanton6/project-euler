/*
 * Using names.txt, a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order.
 * Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 x 53 = 49714.
 * What is the total of all the name scores in the file?
 */

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;

public class NamesScores {

    static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static void main(String[] args) throws FileNotFoundException {
        String[] names = getNames();
        Arrays.sort(names);
        BigInteger finalScore = BigInteger.valueOf(0);
        for (int i = 0; i < names.length; i++) {
            int score = getNameScore(names[i], i);
            finalScore = finalScore.add(BigInteger.valueOf(score));
        }
        System.out.println(finalScore.toString());
    }

    static String[] getNames() throws FileNotFoundException {
        File file = new File("022 Names Scores\\names.txt");
        Scanner reader = new Scanner(file);
        String[] names = reader.nextLine().split(",");
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].replace("\"", "");
        }
        reader.close();
        return names;
    }

    static int getNameScore(String name, int index) {
        int score = 0;
        for (char c : name.toCharArray()) {
            score += ALPHABET.indexOf(c) + 1;
        }
        return score * (index+1);
    }

}
