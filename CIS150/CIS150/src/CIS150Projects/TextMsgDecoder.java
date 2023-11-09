package CIS150Projects;
import java.util.Scanner;
//Charles Eubanks, CIS150.600, Homework 1, TextMsgDecoder

public class TextMsgDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String text;
      
      System.out.println("Enter text: ");
      text = scnr.nextLine();
      System.out.println("You Entered: " + text);
      
      if (text.indexOf("BFF") != -1) {
    	  System.out.println("BFF: best friend forever");
      }
      if (text.indexOf("IDK") != -1) {
    	  System.out.println("IDK: I don't know");
      }
      if (text.indexOf("JK") != -1) {
    	  System.out.println("JK: just kidding");
      }
      if (text.indexOf("TMI") != -1) {
    	  System.out.println("TMI: too much information");
      }
      if (text.indexOf("TTYL") != -1) {
    	  System.out.println("TTYl: talk to you later");
      }
   }
}
