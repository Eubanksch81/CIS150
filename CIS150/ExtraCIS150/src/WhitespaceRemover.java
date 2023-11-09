import java.util.Scanner;

public class WhitespaceRemover {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText; 
      //String cleanedText = ""; 
      //boolean hadStartSpace = false;
      //Hint: Check the scanner has input before attempting to read it
      
      userText = scnr.nextLine();
      if (userText.length() != 0 ) { //Meaning is not empty
    	  while (userText.charAt(0) == ' ') {
    		  userText = userText.substring(1); //Increments usertext to remove whitespace
    		  //System.out.println("Substring start");
    		  //hadStartSpace = true;
    	  }
    	  while (userText.charAt(userText.length() - 1) == ' ') {
    		  //if (hadStartSpace = true) { //If the substring was used at start as well
    			//  cleanedText = cleanedText.substring(0, (cleanedText.length() - 1));
    			  //System.out.println("Cleaned Substring End");
    		  //}
    		  //else {
    			  userText = userText.substring(0, (userText.length() - 1));
    			  //System.out.println("user Substring End");
    		  }
    	  }
    	  //if (cleanedText.length() == 0) {
    		 // cleanedText = userText;
    		  //System.out.println("Clear");
    	  //}
      
      
      System.out.println(userText);
      //System.out.println(userText.length());
   }
}

/* Users may type or copy-paste in a text box of a web form, perhaps a name like "Joe Smith".
 *  The user sometimes has whitespace before or after the text, like " Joe Smith ". 
 *  A program typically strips such leading and trailing whitespace. Given a string, 
 *  create a new string that lacks any leading or trailing spaces. Given " Joe Smith ", 
 *  the new string should be "Joe Smith". Be sure to handle the case of the user entering only whitespace, 
 * or entering nothing, which each should yield an empty string "".
 */