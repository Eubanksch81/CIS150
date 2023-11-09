package CIS150Projects;
import java.util.Scanner;

public class Zylabs12DescendingOrder {
   // TODO: Write a void method selectionSortDescendTrace() that takes 
   //       an integer array and the number of elements in the array as arguments, 
   //       and sorts the array into descending order.
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
	   int i;
	   int j;
	   int indexMax;
	   int temp;
	   
	   for (i = 0; i < numElements - 1; ++i) {
	         // Find index of largest remaining element
	         indexMax = i;
	         for (j = i + 1; j < numElements; ++j) {

	            if (numbers[j] > numbers[indexMax]) {
	               indexMax = j;
	            }
	         }

	         // Swap numbers[i] and numbers[indexSmallest]
	         temp = numbers[i];
	         numbers[i] = numbers[indexMax];
	         numbers[indexMax] = temp;
	         
	       for (int m = 0; m < numElements; ++m) { //Prints array
	     	  System.out.print(numbers[m] + " ");
	       }
	       System.out.println("");
	      }
	   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input = scnr.nextInt();
      int i = 0;
      int numElements = 0;
      int [] numbers = new int[10];
      Zylabs12DescendingOrder program = new Zylabs12DescendingOrder();

      // TODO: Read in a list of up to 10 positive integers; stop when
      //       -1 is read. Then call selectionSortDescendTrace() method.
      while (input != -1 && i < 10) {
    	  numbers[i] = input;
    	  input = scnr.nextInt();
    	  ++i;
      }
      numElements = i;
      selectionSortDescendTrace(numbers, numElements);
      
   }
}