/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible (divisible with no remainder) by all of the numbers from 1 to 20?
 */

public static void main(String[] args) {
	System.out.println(findSmallestMultiple(20));
}

public static int findSmallestMultiple(int maxDivisor) {
	for (int n = 20; ; n += 20) {
		for (int d = 2; d <= 20; d++) {
			if (!(n % d == 0)) break;
			if (d == 20) {
				return n;
			}
		}
	}
}