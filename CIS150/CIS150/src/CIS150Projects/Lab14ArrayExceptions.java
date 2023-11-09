package CIS150Projects;
import java.util.Scanner;

public class Lab14ArrayExceptions {
   public static void main(String[] args) throws Exception {
      Scanner scnr = new Scanner(System.in);
      String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
      int index;

		index = scnr.nextInt();
		
		try {
			if (index < 0) {
				throw new ArrayIndexOutOfBoundsException("Exception! Index " + index + " is out of bounds for length " + 
						names.length + "\n" + "The closest name is: " + names[0]);
			}
			else if (index > names.length) {
				throw new ArrayIndexOutOfBoundsException("Exception! Index " + index + " is out of bounds for length " + 
						names.length + "\n" + "The closest name is: " + names[9]);
			}
			for (int i = 0; i < names.length; ++i) {
				if (i == index) {
					System.out.println("Name: " + names[i]);
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException excpt) {
			System.out.println(excpt.getMessage());
		}
		
   }
}

/* Given an array of 10 names, complete the main method that outputs the name specified by the array index entered by the user.
 *  Use a try block to output the name and a catch block to catch any ArrayIndexOutOfBoundsException. 
 *  Output the message from the exception object if an ArrayIndexOutOfBoundsException is caught.
 *   Output the first element in the array if the index is negative or the last element if the index is greater than the size of the array.
 *   
	Hint: Format the exception outputs using the getMessage() method from the exception object. Do not hard code the exception messages.
 */