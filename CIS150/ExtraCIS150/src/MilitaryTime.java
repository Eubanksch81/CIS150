import java.util.Scanner;

public class MilitaryTime {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentHour;
      int currentMinute;
      String ampm;
      
      currentHour = scnr.nextInt();
      currentMinute = scnr.nextInt();
      ampm = scnr.next();
      
      //System.out.println(currentHour);
      //System.out.println(currentMinute);
      //System.out.println(ampm);
      
      if (ampm.equals("AM") || ampm.equals("am")) {
    	  if (currentHour > 9 && currentHour < 12) { //10 - 11
    		  if (currentMinute > 9) { // 10 - 59
    			  System.out.println(currentHour + ":" + currentMinute);
    		  }
    		  else {
    			  System.out.println(currentHour + ":0" + currentMinute);
    		  }
    	  }
    	  else if (currentHour == 12) {
    		  if (currentMinute > 9) { // 10 - 59
    			  System.out.println("00:" + currentMinute);
    		  }
    		  else { // 0 - 9
    			  System.out.println("00:0" + currentMinute);
    		  }
    	  }
    	  else if (currentHour > 0 && currentHour < 10) {
    		  if (currentMinute > 9) { // 10 - 59
    			  System.out.println("0" + currentHour + ":" + currentMinute + " " + ampm);
    		  }
    		  else {
    			  System.out.println("0" + currentHour + ":0" + currentMinute + " " + ampm);
    		  }
    	  } 
      }
      else if (ampm.equals("PM") || ampm.equals("pm")) { // 12 PM - 11:59 PM
    	  if (currentHour == 12) {
    		  if (currentMinute > 9) { // 10 - 59
    			  System.out.println(currentHour + ":" + currentMinute);
    		  }
    		  else { // 0 - 9
    			  System.out.println(currentHour + ":0" + currentMinute);
    		  }
    	  }
    	  else if (currentHour < 12) {
    		  if (currentMinute > 9) { // 10 - 59
    			  System.out.println((currentHour + 12) + ":" + currentMinute);
    		  }
    		  else { // 0 - 9
    			  System.out.println((currentHour + 12) + ":0" + currentMinute);
    		  }
    	  }
      }
   }
}