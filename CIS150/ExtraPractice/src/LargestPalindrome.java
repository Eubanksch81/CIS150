//Nolan, Quest
public class LargestPalindrome { //906609 993 * 913

	public static void main(String[] args) {
		int product = 0;
		String potentialPalindrome;
		String palinReverse;
		int confirmedPalindrome = 0;
		boolean firstPalindromeFound = false;
		int i;
		int j;
		
		for (i = 999; i > 200; --i) { //Tests each number
			for (j = 999; j > 200; --j) {
				product = i * j;
				System.out.println("i - j: " + i + " " + j);
				potentialPalindrome = Integer.toString(product);
				palinReverse = getPalinReverse(potentialPalindrome);
				if (isPalindrome(potentialPalindrome, palinReverse)) {//If the product is a palindrome
					if (firstPalindromeFound == false) {
						firstPalindromeFound = true;
						confirmedPalindrome = product;
						//System.out.println("First palindrome: " + confirmedPalindrome);
						j = 999;
						break;
					}
					else if (firstPalindromeFound == true && product >= confirmedPalindrome) { 
						//If the found number in this loop is greater than or equal to the first palindrome, 
						//AND there is an already predefined palindrome found. 
						confirmedPalindrome = product;
						firstPalindromeFound = true;
						//System.out.println("Current palindrome: " + confirmedPalindrome);
						j = 999;
						break;
					}
				}
			}
			product = i * j;
			potentialPalindrome = Integer.toString(product);
			palinReverse = getPalinReverse(potentialPalindrome);
			if (isPalindrome(potentialPalindrome, palinReverse)) { //If the product is a palindrome
				if (firstPalindromeFound == true && product >= confirmedPalindrome) { //If the found number in this loop is greater than or equal to the first palindrome, 
					//AND there is an already predefined palindrome found. 
					confirmedPalindrome = product;
					//System.out.println("Current palindrome: " + confirmedPalindrome);
					i = 999;
					break;
				}
			}
		}
		
		System.out.println("Final Result: " + confirmedPalindrome);
	}
	
	public static String getPalinReverse(String palindrome) {
		String palinReverse = "";
		char tempChar;
		
		for (int i = palindrome.length() - 1; i >= 0; --i) {
			tempChar = palindrome.charAt(i);
			palinReverse += tempChar;
		}
		System.out.println(palindrome);
		//System.out.println(palinReverse);
		
		return palinReverse;
		
		
	}
	
	public static boolean isPalindrome(String palindrome, String palinReverse) {
		boolean result;
		
		if (palindrome.equals(palinReverse)) {
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	//999 999
	//Have nested loop move second num downward by 1, multiplying by the first number until a palindrome is reached (potential max)
	//Have base loop move first num downward by 1 with the second num back to 999 until a panindrome >= than the first palindrome is reached.

}
