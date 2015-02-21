package problem2;

/*Write a program that uses a two dimensional array to store the highest and lowest temperatures for each
 month of the calendar year. The temperatures will be entered at the keyboard. This program must output the
 average high, average low, and highest and lowest temperatures of the year. The results will be printed on
 the console. The program must include the following methods:
 */

import java.util.Scanner;

public class Temperature {

	private static String [] monthArray = {"January", "Febuary", "March", "April", "May", "June", "July", 
		"August", "September", "October", "November", "December"};
	private static double highTemp = 0.0;
	private static double lowTemp = 0.0;
	private final static int NUM_OF_MONTH = 12;
	private final static int NUM_OF_TEMP = 2;
	private static Scanner input = new Scanner(System.in);
	private static int i = 0;
	private static int maxTempIndex = 0;
	private static int minTempIndex = 0;
	private static double averageLow = 0.0;
	private static double averageHigh = 0.0;
	private static double[][] yearTempArray = new double[NUM_OF_MONTH][NUM_OF_TEMP];

	
	/*
	 * A main method that uses the previous methods to determine the average high
	 * temperature, average low temperature, and highest and lowest temperatures for
	 * the year. The main method must print out these average temperatures as well
	 * as the month and temperature for the highest and lowest temperatures for the
	 * year.
	 */

	public static void main(String[] args) {
		
		double [][] temp = inputTempForYear();
		System.out.println("Average high of the year: "+ calculateAverageHigh(temp));
		System.out.println("Average low of the year: " +calculateAverageLow(temp));
		int highIndex = findHighestTemp(temp);
		int lowIndex = findLowestTemp(temp);
		System.out.println("The highest temperature of the year: "+ temp[highIndex][0]);
		System.out.println("The lowest temperature of the year: " + temp[lowIndex][1]);
		
		}
			
	/*
	 * A method named inputTempForMonth whose purpose is to input a high and a
	 * low temperature for a specific month. The month and the array of
	 * temperatures will both be passed as input arguments to the method. The
	 * method will not have a return value.
	 */

	public static void inputTempForMonth(int month, double[][] tempArray) {
				
		System.out.println("Please enter the highest temperature for "
				+ monthArray[month]);
		highTemp = input.nextDouble();
		tempArray[month][0]= highTemp;
		System.out.println("Please enter the lowest temperature for "
				+ monthArray[month]);
		lowTemp = input.nextDouble();
		tempArray[month][1]= lowTemp;
	}


	/*
	 * A method named inputTempForYear whose purpose is to input a high and a
	 * low temperature for every month of the year. There are no input arguments
	 * for this method, but the method does return a completed multidimensional\
	 * array of temperatures for the year.
	 */
	public static  double [] [] inputTempForYear(){
		
		for (int i = 0; i < NUM_OF_MONTH ; i++){
			
			inputTempForMonth(i, yearTempArray); 
		}
		return yearTempArray;
	}
		

	/*
	 * A method named calculateAverageHigh whose purpose is to calculate the
	 * average high temperature for the year. This method will take the array of
	 * temperatures as input and will return the average high temperature for
	 * the year.
	 */

	private static double calculateAverageHigh(double[][] temp) {
		
		double sumOfAverageHigh = 0;
		for(int z = 0; z <NUM_OF_MONTH; z++ ){
			sumOfAverageHigh = sumOfAverageHigh + temp [z][0];
			
			
		}
		
		averageHigh = ((sumOfAverageHigh/NUM_OF_MONTH)*100.0)/100;
		return averageHigh;
	
	}
	
	/*
	 * A method named calculateAverageLow whose purpose is to calculate the
	 * average low temperature for the year. This method will take the array of
	 * temperatures as input and will return the average low temperature for the
	 * year.
	 */

	private static double calculateAverageLow(double[][] temp) {
		
		double sumOfHighTemp = 0;
		for(int z = 0; z <NUM_OF_MONTH; z++ ){
			sumOfHighTemp = sumOfHighTemp + temp [z][1];
		}
		
		averageLow = (sumOfHighTemp/NUM_OF_MONTH)*100.0/100;
		return averageLow;
	
	}
	
	/*
	 * A method named findHighestTemp whose purpose is to return the index value of
	 * the highest temperature for the year. If the highest temperature of the year
	 * occurs more than once in the year, then the method should return the index of
	 * the first month that had the temperature. The method will take the array of
	 * temperatures as an input argument and return the index of the highest
	 * temperature.
	 */
	
	private static int findHighestTemp(double[][] temp) {
		double maxValue = temp[NUM_OF_MONTH-1][0];
		int x = NUM_OF_MONTH - 1;
		
			while(x >= 0){
				if(temp[x][0] > maxValue){
					maxValue = temp[x][0];
					
					maxTempIndex = x;
				}
				x--;
			}
		return maxTempIndex;
			
	}

		
		
/*
 * A method named findLowestTemp whose purpose is to return the index value of
 * the lowest temperature for the year. If the lowest temperature of the year
 * occurs more than once in the year, then the method should return the index of
 * the first month that had the temperature. The method will take the array of
 * temperatures as an input argument and return the index of the lowest
 * temperature.
 */

	private static int findLowestTemp(double[][] temp) {
		double minValue = temp[NUM_OF_MONTH-1][1];
		int x = NUM_OF_MONTH-1;
		
			while(x >= 0){
				if(temp[x][1] < minValue){
					minValue = temp[x][1];
					minTempIndex = x;
				}
				x--;
			}
			
			return minTempIndex;
		
	}
}	



