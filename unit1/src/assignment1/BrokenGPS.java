/*Student:Yin Fong Mo
 * Assignment # 1, Problem 2 
 * CS 201
The purpose of this program is to calculate 
the distance from the initial point(0,0) to the location 
point after one hour of driving. Assuming my 
GPS is broken and I am driving with 60 mile per hour. 
My broken GPS changes direction between North, 
South, West, and East every 5 minutes. 
 
/*Algorithm 
 * Start
 * initialize variables
 * Create a while loop that begins at time is 0 minutes and ends when the time is 60 mintues
 * randomly assign a number from 1 to 4 to determine which direction to go
 * use a switch statement to add or minus the location values of x or y
 * set time = time + 5 minutes
 * set total distance = Square root (( x2 - x1)^2 + (y2 - y2)^2)
 * print current time, current change direction, current location
 * end loop 
 * print final location. total distance 
 * end 
 */
package assignment1;
import java.util.Random;


public class BrokenGPS {
	
	public static void main(String[] args) {
		
	//Initialize variables 
	Random direction = new Random(); 
	/*initial position of the car (0,0)*/
	int x = 0; 
	int y = 0;
	//set time to 0
	int time = 0;
	String compass = " "; 
	final int MILE_PER_MINUTE = 60/60; 
	final int CHANGE_MINUTES = 5; // change minutes is set to be constant
	final int TOTAL_MINUTES = 60; // total minutes is set to be constant
	double totalDrivingDistance = 0.0; // total driving distance after 1 hour or 60 minutes
	
/*Loop begins at 0 minute, randomly choose a direction - north, south,
  east and west every five minutes, and the loop will end after 60 minutes is passed = 12 iterations
  the program will randomly assign a value from (1)north, (2)east, (3)south, (4)west during each iteration
  The moving distance is 5 mile in every iteration*/

		 //randomly assign a value from 1 to 4
		
		/*using switch statement to locate moving direction/distance every 5 minutes*/
		while (time < TOTAL_MINUTES){
			
		int location = direction.nextInt(4) + 1;
		
		switch(location){ 
		
		case 1:
			y = y + MILE_PER_MINUTE* CHANGE_MINUTES;
			compass = "North"; 
			break;
			
		case 2:
			x = x + MILE_PER_MINUTE* CHANGE_MINUTES;
			compass = "East";
			break;
			
		case 3:
			y = y - MILE_PER_MINUTE* CHANGE_MINUTES;
			compass ="South";
			break;
			
		case 4:
			x = x - MILE_PER_MINUTE* CHANGE_MINUTES;
			compass = "West";
			break;
			
		default :	
			System.out.println("Error!");
			break;
		}
		time = time + CHANGE_MINUTES;
		System.out.println("After " + time + " mintues ,my broken GPS changes direction to "+ compass);
		System.out.println("Current location is"+ "("+ x +" , " + y + ")");
		
	}
	/*sum up the square of the distance between initial point and the end point of x-axis 
	and the distance between initial point and the end point of axis*/
	/* square root the result and round it to two digit*/
	totalDrivingDistance = Math.round(Math.sqrt(Math.pow((x-0),2)+ Math.pow((y-0), 2)));
	//display the current location and the distance of the car after driving for an hour
	System.out.println("After driving for an hour with 60 miles/hour. My final location is ( " +x+" , "+y+" )" );
	System.out.print("The distance from the initial point to my final location point is: ");
	System.out.print(totalDrivingDistance);
    System.out.println(" miles");
    
    
    
	}
}


