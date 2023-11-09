package CIS150Projects;
import java.util.Scanner; 

public class LabProgram {
   
   public static boolean isArrayMult10 (int[] arrayValues) {
	   boolean multVals = false;
	   int numMult10s = 0;
	   
	   for (int i = 0; i < arrayValues.length; ++i) {
		   if (arrayValues[i] % 10 == 0) {
			   numMult10s += 1;
			   //System.out.print(numMult10s + " "); //Prints each mult10
		   }
	   }
	   if (numMult10s == arrayValues.length) {
		   multVals = true;
	   }
	   
	   return multVals;
   }
   public static boolean isArrayNoMult10 (int[] arrayValues) {
	   boolean noMultVals = false;
	   int numMult10s = 0;
	   
	   for (int i = 0; i < arrayValues.length; ++i) {
		   if (arrayValues[i] % 10 == 0) {
			   numMult10s += 1;
			   //System.out.print(numMult10s + " "); //Prints each mult10
		   }
	   }
	   if (numMult10s == 0) {
		   noMultVals = true;
	   }
	   
	   return noMultVals;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arraySize;
      
      arraySize = scnr.nextInt();
      int[] numbers = new int[arraySize];
      
      for (int i = 0; i < numbers.length; ++i) {
    	  numbers[i] = scnr.nextInt();
      }
      
      /*for (int i = 0; i < numbers.length; ++i) { //Prints each number in array for testing
    	  System.out.print(numbers[i] + " ");
      }*/
      
      if (isArrayMult10(numbers) == true) { //All 10s
    	  System.out.println("all multiples of 10");
      }
      else { //Mixed vals or no10s
    	  if (isArrayNoMult10(numbers) == true) { //No10s
    		  System.out.println("no multiples of 10");
    	  }
    	  else { //Mixed vals
    		  System.out.println("mixed values");
    	  }
      }
   }
}