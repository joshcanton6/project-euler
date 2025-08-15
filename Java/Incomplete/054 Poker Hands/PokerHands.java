/*
 * In the card game poker, a hand consists of five cards and are ranked, from lowest to highest, in the following way:
 * 
 * High Card: Highest value card.
 * One Pair: Two cards of the same value.
 * Two Pairs: Two different pairs.
 * Three of a Kind: Three cards of the same value.
 * Straight: All cards are consecutive values.
 * Flush: All cards of the same suit.
 * Full House: Three of a kind and a pair.
 * Four of a Kind: Four cards of the same value.
 * Straight Flush: All cards are consecutive values of same suit.
 * Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.
 * 
 * The cards are valued in the order:
 * 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace.
 * 
 * If two players have the same ranked hands then the rank made up of the highest value wins;
 * for example, a pair of eights beats a pair of fives (see example 1 below).
 * But if two ranks tie, for example, both players have a pair of queens,
 * then highest cards in each hand are compared (see example 4 below);
 * if the highest cards tie then the next highest cards are compared, and so on.
 * 
 * The file, poker.txt, contains one-thousand random hands dealt to two players.
 * Each line of the file contains ten cards (separated by a single space):
 * the first five are Player 1's cards and the last five are Player 2's cards.
 * You can assume that all hands are valid (no invalid characters or repeated cards),
 * each player's hand is in no specific order, and in each hand there is a clear winner.
 * 
 * How many hands does Player 1 win?
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class PokerHands {

    public static ArrayList<String[]> p1hands = new ArrayList<String[]>();
    public static ArrayList<String[]> p2hands = new ArrayList<String[]>();
    public static int p1wins = 0, p2wins = 0;

    public static void main(String[] args) {
        getHands();
        for (int i = 0; i < p1hands.size(); i++) {
            compareHands(p1hands.get(i), p2hands.get(i));
        }
    }

    public static void getHands() {
        try (BufferedReader br = new BufferedReader(new FileReader("poker.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] items = line.split(" ");
                p1hands.add(Arrays.copyOfRange(items, 0, 5));
                p2hands.add(Arrays.copyOfRange(items, 5, 10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void compareHands(String[] p1, String[] p2) {
        int p1value = getHandValue(p1);
        int p2value = getHandValue(p2);
        throw new UnsupportedOperationException("Unimplemented method 'compareHands'");
    }

    private static int getHandValue(String[] hand) {
        // Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.
        
        throw new UnsupportedOperationException("Unimplemented method 'getHandValue'");
    }
}