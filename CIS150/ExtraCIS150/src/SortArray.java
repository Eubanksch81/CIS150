import java.util.Arrays;
import java.util.Scanner;

public class SortArray /*LabProgram*/ {

	public static void sortArray(int[] myArr, int arrSize) {
		//Take the array and its size, then print array
		int tempStore;
		for (int j = 0; j < arrSize; ++j) { //Swaps as many times as the array's size.
			//This is extremely inefficient, but it works
			for (int i = 0; i < arrSize; ++i) {
				if (myArr[i] != myArr[arrSize - 1]) { //Stops if statement if loop is on size - 1. Prevents overflow
					if (myArr[i] < myArr[i + 1]) { //If the first value is less than the next
						tempStore = myArr[i];
						myArr[i] = myArr[i + 1]; 
						myArr[i + 1] = tempStore; //Swaps the two numbers
					}
				}
			}
		}
		System.out.println(Arrays.toString(myArr)); //This is actually cleaner, but the formatting for output is different
		/*for (int i = 0; i < arrSize; ++i) {
			System.out.print(myArr[i] + ", ");
		}*/ //This is the crappier version of print
	}

   public static void main(String[] args) {
      int arraySize = 0; 
      Scanner scnr = new Scanner(System.in);
      SortArray labObject = new SortArray();
      
      arraySize = scnr.nextInt();
      int[] input = new int[arraySize];
      for (int i = 0; i < input.length; ++i) { //Gets input for array
    	  input[i] = scnr.nextInt();
      }
      //ystem.out.println(Arrays.toString(input));
      labObject.sortArray(input, arraySize);
   }
}