package CIS150Projects;
import java.util.Scanner;

public class Zylabs5PartOne {
   String message;
   public String golfScore(int par, int strokes) {
      if (par == 3 || par == 4 || par == 5) {
    	  if (par - strokes == 2) {
    		  message = "Eagle";
    	  }
    	  else if (par - strokes == 1){
              message = "Birdie";
          }
    	  else if (par - strokes == 0) {
        	  message = "Par";
          }
    	  else if (par - strokes == -1) {
        	  message = "Bogey";
          }
      }
      else {
    	  System.out.println("Error");
      }
      return message;
   }
   
   public static void main(String[] args) {
	   Zylabs5PartOne score = new Zylabs5PartOne();
      Scanner scnr = new Scanner(System.in);
      int par;
      int strokes;
      String name;
      
      par = scnr.nextInt();
      strokes = scnr.nextInt();
      
      name = score.golfScore(par, strokes);
      
      System.out.println(name);
   }
}


//Zylabs Portion:
/*import java.util.Scanner;

public class GolfScores {
   String message;
   public String golfScore(int par, int strokes) {
      if (par == 3 || par == 4 || par == 5) {
    	  if (par - strokes == 2) {
    		  message = "Eagle";
    	  }
    	  else if (par - strokes == 1){
              message = "Birdie";
          }
    	  else if (par - strokes == 0) {
        	  message = "Par";
          }
    	  else if (par - strokes == -1) {
        	  message = "Bogey";
          }
      }
      else {
    	  System.out.println("Error");
      }
      return message;
   }
   
   public static void main(String[] args) {
	   GolfScores score = new GolfScores();
      Scanner scnr = new Scanner(System.in);
      int par;
      int strokes;
      String name;
      
      par = scnr.nextInt();
      strokes = scnr.nextInt();
      
      name = score.golfScore(par, strokes);
      
      System.out.println(name);
   }
}
*/


