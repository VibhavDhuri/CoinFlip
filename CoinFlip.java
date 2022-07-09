import java.util.Scanner;
import java.util.Random;

public class CoinFlip {

	public static void main(String[] args) {
		double tails, tailsCount = 0, tailsPercentage;
		double heads, headsCount = 0, headsPercentage;
		System.out.println("Put the no. of times you want the coin to be flipped:");
		Scanner scanner = new Scanner(System.in);
		int noOfFlips = scanner.nextInt();
		if (noOfFlips > 0) {
			for (int i = 1; i <= noOfFlips; i++) {
				double coinResult = Math.random();
				if (coinResult <= 0.5) {
					System.out.println("Flip No " + i + " : " + "Tails");
					tailsCount++;
				} else {
					System.out.println("Flip No " + i + " : " + "Heads");
					headsCount++;
				}

			}
			System.out.println("Total Tails: " + tailsCount);
			System.out.println("Total Heads: " + headsCount);
			tailsPercentage = tailsCount / noOfFlips * 100;
			headsPercentage = headsCount / noOfFlips * 100;
			System.out.println("Percentage of Tails is: " + tailsPercentage + " %");
			System.out.println("Percentage of Heads is: " + headsPercentage + " %");
		}

		else {
			System.out.println("Input no. error.");
		}

	}
}
