import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ArraysMethods {

	public static void main(String[] args) {
	
//Questions #1.
// create a array and subtract the first number from the last number without using 7. 		

//A.
	int[] array= {3,9,23,64,2,8,28,93,60};
	System.out.println(array[0]-array[array.length-1]);
	
//B.
// add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths) 
	System.out.println(array[0]-array[array.length-1]);
	
//C.
// use a loop to iterate through the array and calculate the average age. Print the result to the console. 
	double sum= 0;
	for( int number :array) {
		sum += number;
	}
	double average = sum/array.length;
	System.out.println(average);
	
//Question #2.
//A.
	// use a loop to calculate the average number of letters. 
	String[] stringName= { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	int sumOfLetters =0;
	for(String name:stringName) {
		sumOfLetters += name.length();
	}
	System.out.println(sumOfLetters/stringName.length);

//B.
	// use a loop to concatenate all the names together seperated by spaces
	String sumOfNames = ""; 
	for (String concatenate: stringName) {
		sumOfNames += concatenate + " ";	
	}
	System.out.println(sumOfNames);
	
//Question #3. 
	// How do you access the last element of any array?
		System.out.println(stringName[5]);
		
			
//Question #4.		
	//How do you access the first element of any array?	
		System.out.println(stringName[0]);

//Question #5. Create a new Array of Int called NameLengths. Add the length of each name to the nameLengths array. 
		int[] nameLengths = new int[stringName.length];
		
		for(int i=0; i<stringName.length; i++) {
			nameLengths[i]=stringName[i].length();
		}
		for(int x:nameLengths) {
			System.out.println(x);
		}
	
//Question #6.Calculate the sum of all elements in nameLength array
	
	 sum = 0;
		for(int i=0; i< nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println(sum);
		
	
//Question #7 
		
	System.out.println(wordRepeat("Hello",3));
	
//Question #8. // create a method that prints out full name including spaces between first name and last name
	
	System.out.println(getFullName("Adrian", "Edirisinghe"));

//Question #9.
	
	System.out.println(checkIfSumGreaterThan100(array));

//Question #10. 
	
	double [] firstArray = {5.23,5.42,6.32};
	System.out.println(averageOfNumbers(firstArray));
	
//Question #11. 
	
	double [] secoundArray = {5.23,5.42,6.32};   //5.6
	double[] thirdArray = {10,4.5,3.5,31};   //12.25
	System.out.println(isGroceriesMore(firstArray,secoundArray));
		
		
//Question #12.
	
	boolean isHotOutside = true;
	double moneyInPocket = 10.50;
	System.out.println(willBuyDrink(isHotOutside,moneyInPocket ));
	System.out.println(willBuyDrink(true,20.00 ));
	
	
//Question #13.	
	System.out.println(willGoToMovies(true,13.50));
	
	
	
	} // end of main method 
	
	//Question #7 Method
	public static String wordRepeat(String word, int y) {
		String str ="";
		for( int i=0; i<y; i++) {
			str += word;
		}
		return str;
	}
	//Question # 8 Method
	
	public static  String getFullName(String firstName, String lastName) {
		return  firstName + " " + lastName;
	}
     
	//Question # 9 Method
	
	private static Boolean checkIfSumGreaterThan100(int[] arr) {
		return Arrays.stream(arr).sum() > 100;
		
	}
	
	//Question #10 Method

	public static double averageOfNumbers(double[] testArray) {
		double averageSum= 0;
		for(double y:testArray ) {
		averageSum += y;
		}
		return averageSum/testArray.length;
	}
	  
	//Question #11 Method
	public static boolean isGroceriesMore(double[] aveargeCostofGroceries, double[] avgCostofTakeout ) {
		double groceriesMore =0;
		double takeOutLess =0;
		double average =0;
		double averageTwo=0;
		for ( double x : aveargeCostofGroceries) {
			groceriesMore += x;
		 average = groceriesMore/aveargeCostofGroceries.length;
		}
		for( double y: avgCostofTakeout) {
			takeOutLess += y;
			averageTwo=takeOutLess/avgCostofTakeout.length;
		}
		if( average < averageTwo  ) {
			return true;
		}
		else {
			return false;
		}
	}		
	
	//Question #12 Method
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}
	      return false;	
	}	
	
	//Question #13 Method
	 
	public static boolean willGoToMovies(boolean isTuesday, double priceOfTicket) {
		if( isTuesday == true && priceOfTicket < 12.00) {
			return true;
		}
		return false;
	}
} // end of class

	
	









