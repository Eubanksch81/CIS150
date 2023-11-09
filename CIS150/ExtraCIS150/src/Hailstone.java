import java.util.Scanner;

public class Hailstone {
   
   int num = 0;
   int incrementNumber = 1;
      
   public void hailstone(int num) {
    while (num != 1) {	
    	if (num % 2 == 0) { // If num is even
    		num = num / 2;
    		System.out.print(num + "\t");
    		incrementNumber += 1;
    	}
    	else if (num % 2 != 0) { // If num is odd
    		num = 3 * num + 1; 
    		System.out.print(num + "\t");
    		incrementNumber += 1;
    	}
    	if (incrementNumber == 10) { //Creates new line after 10 numbers
    		incrementNumber = 0;
    		System.out.println("");
    	}
    	if (num == 2) {
			break;
		}
    }
    System.out.println("1");
    
    	//System.out.println("\n");
      //System.out.print(num + "\t");
  }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Hailstone labObject = new Hailstone();
      int num;
      
      num = scnr.nextInt();
      if (num != 1) {
    	  System.out.print(num + "\t");
      }
      labObject.hailstone(num); // Call hailstone() to print out the hailstone sequence.
   }
}
