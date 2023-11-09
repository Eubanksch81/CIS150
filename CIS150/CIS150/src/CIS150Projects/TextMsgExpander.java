package CIS150Projects;
import java.util.Scanner;
//Charles Eubanks, CIS150.600, Homework 1, TextMsgExpander

public class TextMsgExpander {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String text;
      
      System.out.println("Enter text: ");
      text = scnr.nextLine();
      System.out.println("You entered: " + text + "\n");
      
      if (text.indexOf("BFF") != -1) {
    	  System.out.println("Replaced \"BFF\" with \"best friend forever\".");
    	  text = text.replace("BFF", "best friend forever");
    	  
      }
      if (text.indexOf("IDK") != -1) {
    	  System.out.println("Replaced \"IDK\" with \"I don't know\".");
    	  text = text.replace("IDK", "I don't know");
      }
      if (text.indexOf("JK") != -1) {
    	  System.out.println("Replaced \"JK\" with \"just kidding\".");
    	  text = text.replace("JK", "just kidding");
      }
      if (text.indexOf("TMI") != -1) {
    	  System.out.println("Replaced \"TMI\" with \"too much information\".");
    	  text = text.replace("TMI", "too much information");
      }
      if (text.indexOf("TTYL") != -1) {
    	  System.out.println("Replaced \"TTYl\" with \"talk to you later\".");
    	  text = text.replace("TTYL", "talk to you later");
      }
      System.out.println("");
      
      System.out.println("Expanded: " + text);
   }
}
