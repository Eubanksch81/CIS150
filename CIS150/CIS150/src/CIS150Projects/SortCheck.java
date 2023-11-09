package CIS150Projects;
import java.util.Scanner;

public class SortCheck {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		boolean isSorted = true;
		int prevNum;
		
		int listSize;
		listSize = scnr.nextInt();
		
		int[] list = new int[listSize];
		
		for (int i = 0; i < listSize; ++i) 
		{
			list[i] = scnr.nextInt();
		}
		
		prevNum = list[0];
		
		for (int i = 1; i < listSize; ++i) 
		{
			if (list[i] < prevNum) 
			{
				isSorted = false;
				break;
			}
			prevNum = list[i];
		}
		if (isSorted == true) 
		{
			System.out.println("Sorted");
		}
		else 
		{
			System.out.println("Unsorted");
		}
	}
}
