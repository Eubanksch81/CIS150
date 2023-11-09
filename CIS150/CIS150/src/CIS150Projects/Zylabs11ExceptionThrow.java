package CIS150Projects;
import java.util.Scanner;

public class Zylabs11ExceptionThrow {
   
   public double stepsToMiles(double steps) throws Exception {
      double miles = 0;
      
      if (steps < 0) {
          throw new Exception("Exception: Negative step count entered.");
       }
      else {
    	  miles = steps / 2000;
      }
      return miles;
      
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double stepsTaken;
      stepsTaken = scnr.nextDouble();
      
      Zylabs11ExceptionThrow program = new Zylabs11ExceptionThrow();
      try {
    	  System.out.printf("%.2f", program.stepsToMiles(stepsTaken));
    	  System.out.println("");
      }
      catch (Exception excpt) {
          System.out.println(excpt.getMessage());
       }
   }
}
