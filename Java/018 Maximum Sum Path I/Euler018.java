/*
 * Find the maximum total from top to bottom of the triangle (https://projecteuler.net/problem=18)
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

static class Node {
    int data;
    Node left, right;

    Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

public static void main(String[] args) throws FileNotFoundException {
    int[][] triangle = makeTriangle();
    Node root = makeTree(triangle);
    int sum = findRoute(root);
    System.out.println(sum);
}

public static int[][] makeTriangle() throws FileNotFoundException {
    File file = new File("018 Maximum Sum Path I\\triangle.txt");
    Scanner reader = new Scanner(file);
    int[][] triangle = new int[15][15];
    for (int r = 0; reader.hasNextLine(); r++) {
        String[] row = reader.nextLine().split(" ");
        for (int c = 0; c <= row.length-1; c++) {
            triangle[r][c] = Integer.parseInt(row[c]);
        }
    }
    reader.close();
    return triangle;
}

public static Node makeTree(int[][] triangle) {
    Node root = new Node(triangle[0][0]);
    makeChildren(root, triangle, 0, 0);
    return root;
}

public static void makeChildren(Node parent, int[][] triangle, int row, int col) {
    if (row + 1 <= triangle.length - 1) {
        parent.left = new Node(triangle[row+1][col]);
        parent.right = new Node(triangle[row+1][col+1]);
        makeChildren(parent.left, triangle, row+1, col);
        makeChildren(parent.right, triangle, row+1, col+1);
    }
}

public static int findRoute(Node node) {
    if (node == null) return 0;
    int leftMax = findRoute(node.left);
    int rightMax = findRoute(node.right);
    return node.data + Math.max(leftMax, rightMax);
}