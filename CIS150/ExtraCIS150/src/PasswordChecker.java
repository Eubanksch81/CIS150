import java.util.Scanner;

public class PasswordChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String password;
      boolean hasLetter = false;
      boolean hasNumber = false;
      boolean hasSpecial = false;
      char check = ' ';
      
      password = scnr.next();
      
      if (password.length() < 8) {
		System.out.println("Too short");  
	  }
      for (int i = 0; i < password.length(); ++i) {
    	  check = password.charAt(i);
    	  //System.out.print(check + " ");
    	  if (Character.isLetter(check)) {
    		  hasLetter = true;
    		  //System.out.println("hasLetter");
    	  }
    	  if (Character.isDigit(check)) {
    		  hasNumber = true;
    		  //System.out.println("hasNumber");
    	  }
    	  if (check == '!' || check == '#' || check == '%') {
    		  hasSpecial = true;
    		  //System.out.println("hasSpecial");
    	  }
      }
      //System.out.println(hasLetter + " " + hasNumber + " " + hasSpecial);
      if (hasLetter == false) {
    	  System.out.println("Missing letter");
      }
      if (hasNumber == false) {
    	  System.out.println("Missing number");
      }
      if (hasSpecial == false) {
    	  System.out.println("Missing special");
      }
      if (hasLetter == true && hasNumber == true && hasSpecial == true && password.length() > 8) {
    	  System.out.println("OK");
      }
   }
}

/* Websites commonly require a password that satisfies several requirements.
 *  Write a program that checks if an input string satisfies the following (error message is shown for each):
 *  At least 8 characters (Too short)
    At least one letter (Missing letter)
    At least one number (Missing number)
    At least one of these special characters: !, #, % (Missing special)
    
    Output OK, or all related error messages (in above order). If the input string is "Hello", the output is:
    Too short
    Missing number
    Missing special
 */