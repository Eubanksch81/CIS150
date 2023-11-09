package CIS150Projects;
import java.util.Scanner;

public class Lab6FindMax {
	
   public int findMax() {
	  Scanner scnr = new Scanner(System.in);
	  int currMax = 0;
      int currValue;
      currValue = scnr.nextInt();
      
      while (currValue != -1) {
    	  if (currValue > currMax) {
    		  currMax = currValue;
    	  }
    	  currValue = scnr.nextInt();
      }
      return currMax;
   }
    
   public static void main(String[] args) {
	  Lab6FindMax test = new Lab6FindMax();
      System.out.println(test.findMax());
   }
}