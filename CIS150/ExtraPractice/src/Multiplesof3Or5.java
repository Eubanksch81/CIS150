//Multiples of 3 or 5 for all numbers below 1000
import java.util.Scanner;

public class Multiplesof3Or5 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Input max number: ");
		
		int maxNumber = scnr.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= maxNumber; ++i) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);

	}

}
