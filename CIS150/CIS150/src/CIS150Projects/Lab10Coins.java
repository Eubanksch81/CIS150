package CIS150Projects;
import java.util.Scanner;
import java.util.Random;

public class Lab10Coins {
   
	public static String headsOrTails(Random rand) {
	   int result;
	   String message;
		   result = rand.nextInt(2);
		   if (result == 0) {
			   message = "heads";
		   }
		   else {
			   message = "tails";
		   }
	   
	   return message;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Unique seed
      int flipsNeeded;
      flipsNeeded = scnr.nextInt();
      
      Lab10Coins LabObject = new Lab10Coins();
      
      for (int i = 0; i < flipsNeeded; ++i) {
    	  System.out.println(headsOrTails(rand));
      }
   }
}