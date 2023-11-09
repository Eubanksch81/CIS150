package CIS150Projects;
import java.util.Scanner;
public class Lab7Fibonacci {
   
   public int fibonacci(int n) {
      int[] array = new int[n + 1];
      
      if (n > 0) {
      array[0] = 0;
      array[1] = 1;
      }
      
      for (int i = 0; i <= n; ++i) {
    	if (i > 1) {
    		array[i] = array[i - 1] + array[i - 2];
    		//System.out.print(Array[i] + " ");
    	}
      }
      return array[n];
   }
   public int fibonacciRecursion(int n) {
	   if (n == 0) {
	         return 0;
	      }
	   else if (n == 1) {
	         return 1;  
	   }
	   else {
	      return fibonacci(n-1) + fibonacci(n-2);
	   }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Lab7Fibonacci program = new Lab7Fibonacci();
      int startNum;
      
      startNum = scnr.nextInt();
      //System.out.println("fibonacci(" + startNum + ") is " + 
      //program.fibonacci(startNum));
      
      System.out.println("fibonacci(" + startNum + ") is " + 
    	      program.fibonacciRecursion(startNum));
   }
}