import java.util.Scanner;

public class LicensePlate {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char firstLet;
      char secondLet;
      char thirdLet;
      int firstNum;
      int secondNum;
      int thirdNum;
      
      String licensePlate;
      licensePlate = scnr.next();
      //System.out.println(licensePlate);
      
      firstLet = licensePlate.charAt(0);
      secondLet = licensePlate.charAt(1);
      thirdLet = licensePlate.charAt(2);
      licensePlate = licensePlate.replace(firstLet, '0');
      licensePlate = licensePlate.replace(secondLet, '0');
      licensePlate = licensePlate.replace(thirdLet, '0');
      firstNum = Integer.parseInt(licensePlate);
      secondNum = (firstNum / 10) % 10;
      thirdNum = firstNum % 100 % 10;
      firstNum = firstNum / 100;
      //System.out.println(firstNum);
      //System.out.println(secondNum);
      //System.out.println(thirdNum);
      
      if (thirdNum == 9) {
    	  thirdNum = 0;
    	  if (secondNum == 9) {
    		  secondNum = 0;
    		  if (firstNum == 9) {
    			  firstNum = 0;
    			  if (thirdLet == 'Z') {
    				  thirdLet = 'A';
    				  if (secondLet == 'Z') {
    					  secondLet = 'A';
    					  if (firstLet == 'Z') {
    						  firstLet = 'A';
    					  }
    					  else {
    						  firstLet += 1;
    					  }
    				  }
    				  else {
    					  secondLet += 1;
    				  }
    			  }
    			  else {
    				  thirdLet += 1;
    			  }
    		  }
    		  else {
    			  firstNum += 1;
    		  }
    	  }
    	  else {
    		  secondNum += 1;
    	  }
      }
      else {
    	  thirdNum += 1;
      }
      System.out.println(firstLet + "" + secondLet + thirdLet + "" +
			  firstNum + "" + secondNum + "" + thirdNum);
			  
   }
}