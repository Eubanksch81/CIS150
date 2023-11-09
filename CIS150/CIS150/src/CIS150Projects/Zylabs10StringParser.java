package CIS150Projects;
import java.util.Scanner;

public class Zylabs10StringParser {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput = "";
		Scanner inSS = null;
		String firstName;
		String lastName;
		boolean hasComma = false;
		
		System.out.println("Enter input string:");
		userInput = scnr.nextLine();
		
		while (!userInput.equals("q")) {
			while (hasComma == false) { //Error checker
				for (int i = 0; i < userInput.length(); ++i) {
					if (userInput.charAt(i) == ',') { //Checks each character for a comma.
						hasComma = true;
						//System.out.print(userInput.charAt(i) + " ");
					}
				}
				if (hasComma == false) {
					System.out.println("Error: No comma in string.\n");
					System.out.println("Enter input string:");
					userInput = scnr.nextLine();
				}
			}
			inSS = new Scanner(userInput); //Lets us Read the string in order to parse it. This is the same principle as reading a file.
		
			firstName = inSS.next();
			if (firstName.charAt(firstName.length() - 1) != ',') { 
				if (inSS.hasNext()) { //Meaning firstName , lastName
					lastName = inSS.next();
					if (lastName.equals(",")) {
						lastName = inSS.next();
						System.out.println(firstName + " , " + lastName);
						System.out.println("First word: " + firstName);
						System.out.println("Second word: " + lastName);
						System.out.println("");
					}
				}
				else { //firstName,lastName
					lastName = firstName.substring(firstName.indexOf(','));
					firstName = firstName.substring(0, (firstName.length() - lastName.length()));
					lastName = lastName.substring(1, lastName.length());
					System.out.println(firstName + "," + lastName);
					System.out.println("First word: " + firstName);
					System.out.println("Second word: " + lastName);
					System.out.println("");
				}
			}
			else { //firstName, lastName
				lastName = inSS.next();
				firstName = firstName.substring(0, firstName.length() - 1);
				System.out.println(firstName + ", " + lastName);
				System.out.println("First word: " + firstName);
				System.out.println("Second word: " + lastName);
				System.out.println("");
			}
			
			System.out.println("Enter input string:");
			userInput = scnr.nextLine();
		}
	}

}
