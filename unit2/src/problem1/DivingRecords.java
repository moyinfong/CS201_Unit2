/**The purpose of this assignment is to create methods that use one dimensional 
 * arrays as input and return values for methods. In the sport of diving, seven 
 * judges award a score between 0 and 10, where each score may be a floating-point
 *  value. The highest and lowest scores are thrown out and the remaining scores are
 *   added together. The sum is then multiplied by the degree of difficulty for that 
 *   dive. The degree of difficulty ranges from 1.2 to 3.8 points. The total is then 
 *   multiplied by 0.6 to determine the diver’s score. Write a computer program that 
 *   will ultimately determine the diver’s score. This program must include the following methods:*/

package problem1;

import java.util.Scanner;

public class DivingRecords {

	private static double score = 0;
	private static double degreeOfDifficulty = 0;
	private static Scanner input = new Scanner(System.in);
	private final static int NUM_OF_JUDGE = 7;
	private static double[] scoreArray = new double[NUM_OF_JUDGE];

	/**
	 * A main method that uses the previous methods to determine the score for
	 * the diver and then prints out the score to the console.
	 */

	public static void main(String[] args) {

		{
			inputAllScores();
			inputValidDegreeOfDifficulty();
			calculateScore();

		}

	}

	/**
	 * A method name inputValidScore that inputs one valid score for one judge
	 * for one diver. This method will return the valid score.
	 */

	public static double inputValidScore() {

		score = input.nextDouble();
		while (score > 10 || score <= 0) {
			System.out.println("Invalid score, please re-enter again:");
			score = input.nextDouble();
		}

		return score;
	}

	/**
	 * A method named inputAllScores that creates an array to store the scores
	 * for all judges for the diver. This method will fill the array with a
	 * valid score from each judge. This method does not take input arguments,
	 * but it does return the array of scores.
	 */

	public static double[] inputAllScores() {
		for (int z = 0; z < scoreArray.length; z++) {

			System.out.println("Judge # " + (z + 1));
			System.out.println("Enter a score from 0 to 10");
			inputValidScore();
			scoreArray[z] = score;
		}

		return scoreArray;
	}

	/**
	 * A method named inputValidDegreeOfDifficulty that inputs a valid degree of
	 * difficulty for the dive. The valid degree of difficulty will be returned
	 * from the method.
	 */

	public static double inputValidDegreeOfDifficulty() {

		System.out
				.println("Enter the degree of difficulty between 1.2 to 3.8 points:");
		degreeOfDifficulty = input.nextDouble();
		while (degreeOfDifficulty > 3.8 || degreeOfDifficulty < 1.2) {
			System.out
					.println("Invalid degree of difficulty, please re-enter again:");
			degreeOfDifficulty = input.nextDouble();
		}
		return degreeOfDifficulty;

	}

	/**
	 * A method named calculateScore that will calculate the score for the diver
	 * based on the scores from all judges and the degree of difficulty. The
	 * score will be returned from the method.
	 */

	public static double calculateScore() {

		double maxValue = scoreArray[0];
		double minValue = scoreArray[0];
		double finalScore = 0;
		double MULTIPLIED_POINT = 0.6;
		double sum = 0;

		for (int y = 0; y < scoreArray.length; y++) {
			sum = sum + scoreArray[y];
		}
		for (int z = 1; z < scoreArray.length; z++) {
			if (scoreArray[z] > maxValue) {
				maxValue = scoreArray[z];
			}
		}
		for (int x = 1; x < scoreArray.length; x++) {
			if (scoreArray[x] < minValue) {
				minValue = scoreArray[x];

			}
		}
		System.out.println("After discarding the highest score: " + maxValue
				+ " and lowest score: " + minValue);

		finalScore = (sum - minValue - maxValue) * degreeOfDifficulty
				* MULTIPLIED_POINT;

		System.out.println("The diver's final score is: " + finalScore);

		return finalScore;

	}
}
