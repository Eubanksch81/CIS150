import java.util.*;
public class Letters {
   
   // This method reverses contents of input argument arr.
   public char[] reverse(char[] arr) {
		   char tempVar = arr[0];
	   
	   for (int i = 0; i < arr.length; ++i ) {
		   arr[i] = arr[arr.length - i - 1]; 
		}
		arr[arr.length - 1] = tempVar;
	   
		return arr;
	
   }
   
   public static void main(String[] args) {
      Letters lettersObject = new Letters();
      char [] ch = {};//{'a','b','c'};
      //lettersObject.reverse(ch);
      System.out.println(lettersObject.reverse(ch));  // Should print cba
   }
}