package week04;

public class week04CodingProject {

	public static void main(String[] args) {
		
		// Question 1: 

		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int result = ages[ages.length -1] - ages[0];
		System.out.println("Result is: " + result);    // Subtracts first element from the last (90 - 3 = 90)
		
		
		int[] ages2 = {4, 8, 34, 56, 12, 34, 1, 0, -4};
		
		int answer = ages2[ages2.length -1] - ages2[0];
		System.out.println("Result is: " + answer);       // Subtracts first element from the last (-4 - 4 = -8)
		
		double addA = 0;
		double averageArray = 0;
		
		
		for (int age : ages2) {
			addA += age;
		}
		
		averageArray = addA / ages2.length;
		
		System.out.println("Average for ages2 array is: " + averageArray);
		
		
		
		
		// Question 2:
		
		// (a):
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int totalLetters = 0;
		
		for (String name : names) {
			totalLetters += name.length();              // enhanced for loop to add from zero, the number of letters
		}
		
		double averageLetters = (double) totalLetters / names.length;    // number of letters / the length to find average
		
		System.out.println("Average number of letters for name array is: " + averageLetters);
		
		// (b):
		
		StringBuilder concatenatedNames = new StringBuilder();
		
		for (String name : names) {                                // enhanced for loop to run through all of the names
			concatenatedNames.append(name).append(" ");     	// used .append to add name followed by a space	
		}
		
		System.out.println("Concatenated names: " + concatenatedNames.toString());   
		
		
		// Question 3: How do you access the last element of any array?
		// Answer: By using the .length - 1
		
		
		// Question 4: How do you access the first element of any array?
		// Answer: The first element will always be at index[0].
		
		
		
		// Question 5:
		
		int[] nameLengths = new int[names.length];     // new array called nameLengths
		for (int i = 0; i < names.length; i++) {       // for loop to iterate through the names array to add the length to nameLengths array
			nameLengths[i] = names[i].length();
		}
			
		// Question 6:
			
		int sumOfNameLengths = 0;
		for (int length : nameLengths) {        // loop to iterate over nameLengths array 
			sumOfNameLengths += length;         // calculated the sum of all the elements in the array
		}
		System.out.println("Sum of name lenghts: " + sumOfNameLengths);
		
		
		
		// Question 7:
		
		System.out.println(multiplyString("hello",3));
		
		// Question 8: 
		
		System.out.println(getFullName("Mark","Abernathy"));
		
		// Question 9: 
		
		int[] thisArray = {99,3,99};
		
		System.out.println("Is the sum greater than 100? " + isGreaterThan100(thisArray));
		
		
		// Question 10 
		
		double[] values = {15.5, 20.3, 10.8};
		
		double average = findAverage(values);
		System.out.println("Average: " + average);
		

		
		// Question 11:
		
		double[] array1 = {23.5, 23,0, 99.9};
		double[] array2 = {666.7, 866, 869.3};
		
		System.out.println("Is the average of the first array greater? " + areElementsGreater(array1, array2));
		
		// Question 12:
		
		boolean result1 = false;
		double money = 11.76;
		
		System.out.println("Are both true? " + willBuyDrink(result1, money));
		
		
		
		// Question 13:
		
		int number = 88;
		boolean result2 = isEven(number);   // calling method isEven 
		
		System.out.println(number + " an even number? " + result2);
		
		
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	// *********************** METHODS BELOW HERE ***********************	
		
	}
	
	// Question 7:
	
	public static String multiplyString(String word, int n) {     // Method name mustiplyString, with String name word and int: n
		String result = "";
		for (int i = 0; i < n; i++) {             // for loop with counter that iterates the amount of times to concatenate
			result += word;                   // concatenates the word to the result string during iteration of loop
		}
		return result;               // returns the final concatenated string
	}
	
	
	
	// Question 8:
	
	public static String getFullName(String firstName, String lastName) {  // method called getFullName with two strings firstName & lastName
		return firstName + " " + lastName;                                 // returns the two string with a space in between
	}
	
	
	// Question 9:
	
	public static boolean isGreaterThan100(int[] array) {  // array of int named is GreaterThan100
		int sum = 0;
		
		for (int num : array) {      // adds up all the elements
			sum += num;
		}
		return sum > 100;         // checks to see if it is greater than 100 and returns it
	}
	
	
	// Question 10:
	
	public static double findAverage(double[] array) {   // method that takes an array of double called findAverage
		if (array.length == 0) {
			return 0.0;
		}
		double sum = 0;
		
		for (double num : array) {   // adding the sum of all elements
			sum += num;
		}
		return sum / array.length;   // returns the average
	}
	
	
	// Question 11:
	
	// Write a method that takes two arrays of double and  than the average of the elements in the second array.
	public static boolean areElementsGreater(double[] a, double[] b) {
		boolean result = true;
		
		double aTotal = 0;
		double bTotal = 0;
		double aAverage = 0;
		double bAverage = 0;
		
		// returns true if the average of the elements in the first array is greater
		// Take the average of the first array
		for (double element : a) {
			aTotal += element;
		}
		
		aAverage = aTotal / a.length;
		
		
		// Take the average of the second array
		
		for (double elementB : b) {
			bTotal += elementB;
		}
		
		bAverage = bTotal / b.length;
		
	
		// Find out which array is greater
		
		
		// If first average is greater, return true
		
		// else return false
		
		if (aAverage > bAverage) {
			result = true;
		} else {
			result = false;
		}
		return result;
		
	}
	
	
	
	// Question 12:
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { // method called willBuyDrink that takes a boolean and doulbe
		return isHotOutside && moneyInPocket > 10.50;   // returns true if both are greater than 10.50
	}
	
	
	// Question 13:
	
	public static boolean isEven(int number) {   // the method isEven takes an int called number as a parameter
		return number % 2 == 0;       // using modulo to see if remainder divided by 2 is zero to see if an even number, otherwise returns false
	}
	
	
	
	
	
	
	

}
