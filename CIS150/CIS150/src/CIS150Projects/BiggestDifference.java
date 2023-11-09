package CIS150Projects;
import java.util.Scanner;

public class BiggestDifference {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int listSize;
		int prevNum = 0;
		int currNum;
		int difference;
		int maxDifference = 0;
		
		listSize = scnr.nextInt();
		
		int[] list = new int[listSize];
		for (int i = 0; i < list.length; ++i) {
			list[i] = scnr.nextInt();
		}
		
		for (int i = 0; i < list.length; ++i) {
			currNum = list[i];
			if (i == 0) {
				prevNum = 0;
				difference = 0;
			}
			else {
				difference = Math.abs(currNum - prevNum);
			}
			if (difference > maxDifference) {
				maxDifference = difference;
			}
			prevNum = currNum;
		}
		System.out.println(maxDifference);
		
	}

}

/* PROGRAM PURPOSE: To find the biggest difference in a successive pair of numbers.
	If the input is 5 60 63 68 61 59, the output is 7.

*/