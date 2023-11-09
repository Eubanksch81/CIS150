package CIS150Projects;
import java.util.Scanner;
//Point of the program is to find the amount of even numbers in the four numbers inputted

public class CountEvens {
   
	
	public int countEvens(int num1, int num2, int num3, int num4) {
		int oddNumbers = (num1 % 2) + (num2 % 2) + (num3 % 2) + (num4 % 2);
		int evenNumbers = Math.abs(oddNumbers - 4);
		//System.out.println(num1 % 2);
		//System.out.println(num2 % 2);
		//System.out.println(num3 % 2);
		//System.out.println(num4 % 2);
	
		return evenNumbers;
		//Could also use if statements. That's actually how this was supposed to be done
	}
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      CountEvens labObject = new CountEvens();
      
      int num1;
      int num2;
      int num3;
      int num4;
      
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      
		int result = labObject.countEvens(num1, num2, num3, num4);
		System.out.println("Total evens: " + result);
   }
}
