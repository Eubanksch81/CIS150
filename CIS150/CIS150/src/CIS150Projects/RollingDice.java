package CIS150Projects;
import java.util.Scanner;

public class RollingDice {
   public int rollSpecificNumber(GVDie die, int num, int goal) {
	   int rollsTaken = 0;
	   int tempGoal = 0; //To compare with goal as the rolls increase
	   
	   while (tempGoal != goal) {
		   die.roll();
		   if (die.getValue() == num) {
			   tempGoal += 1;
		   }
		   rollsTaken += 1;
	   }
      
      return rollsTaken; 
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      RollingDice game = new RollingDice();
      GVDie die = new GVDie();   // Create a GVDie object
      die.setSeed(15);   // Set the GVDie object with seed value 15
      int num; //What number to get
      int goal; //To get number X times
      int rolls; //Amount of rolls it took
      
      num = scnr.nextInt();
      goal = scnr.nextInt();
      rolls = game.rollSpecificNumber(die, num, goal);   // Call rollSpecificNumber() and return number of rolls.
      System.out.println("It took " + rolls + " rolls to get a \"" + num + "\" " + goal + " times.");
   }
}