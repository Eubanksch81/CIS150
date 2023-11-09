package CIS150Projects;
import java.util.Scanner; 
//Charles Eubanks, CIS150.600, Homework 1, DrawHalfArrow

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight;
      int arrowBaseWidth;
      int arrowHeadWidth;
      
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();
      
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
      System.out.println("");
      
      while (arrowHeadWidth <= arrowBaseWidth) {
    	  System.out.println("Arrow head width must be greater than arrow base width.");
    	  System.out.println("Enter arrow head width: ");
    	  arrowHeadWidth = scnr.nextInt();
    	  System.out.println("");
      }
      
      for (int i = 0; i < arrowBaseHeight; ++i) {
    	  for (int j = 0; j < arrowBaseWidth; ++j) {
    		  System.out.print("*");
    	  }
    	  System.out.println("");
      }
      
      for (int i = 0; i <= arrowHeadWidth; ++i) {
    	  for (int j = arrowHeadWidth; j > i; --j) {
    		  System.out.print("*");
      	  }
    	  System.out.println("");
      }
   }
}