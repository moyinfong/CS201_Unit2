/*The purpose of this assignment is to create methods that use one dimensional 
arrays as input and return values for methods.*/

package problem1;

import java.util.Scanner;

public class DivingRecords {

	static double degreeOfDifficulty;
	static double finalScore;
	static double score;
	static Scanner input = new Scanner(System.in);
	static final double MULTIPLIED_POINT = 0.6;
	static double sum;
	static final int SIZE_OF_ARRAY = 7;
	static double[] scores = new double[SIZE_OF_ARRAY];
	static double maxValue;
	static double minValue;
	static int i = 0;

	public static void main(String[] args) {

		for (i = 0; i < scores.length; i++) {
			inputValidScore();
			inputAllScores();
		}

		inputValidDegreeOfDifficulty();
		System.out.println("The diver's final score is: " + (calculateScore())
				*  100.0/  100.0);

	}

	public static double inputValidScore() {
		System.out.println("Judge # " + (i + 1));
		System.out.println("Enter a score from 0 to 10");
		score = input.nextDouble();

		return score;
	}

	public static double[] inputAllScores() {
		scores[i] = score;

		return scores;
	}

	public static double inputValidDegreeOfDifficulty() {
		System.out
				.println("Enter the degree of difficulty between 1.2 to 3.8 points:");
		degreeOfDifficulty = input.nextDouble(); 
		return degreeOfDifficulty;

	}

	public static double calculateScore() {

		maxValue = scores[0];
		minValue = scores[0];

		for (int y = 0; y < scores.length; y++) {
			sum = sum + scores[y];
		}
		for (int z = 1; z < scores.length; z++) {
			if (scores[z] > maxValue) {
				maxValue = scores[z];
			}
		}
		for (int x = 1; x < scores.length; x++) {
			if (scores[x] < minValue) {
				minValue = scores[x];

			}
		}
		System.out.println("After discarding the highest score: " + maxValue
				+ " and lowest score: " + minValue);

		finalScore = (sum - minValue - maxValue) * degreeOfDifficulty
				* MULTIPLIED_POINT;

		return finalScore;

	}
}
