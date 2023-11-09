package CIS150Projects;
public class Zylabs5CalcToll {
   int time;
   boolean morning;
   boolean weekend;
   double fee;
   
   public double calcToll(int hour, boolean isMorning, boolean isWeekend) {
	  if (hour < 7 && isMorning == true && isWeekend == false) {
         fee = 1.15;
	  }
	  else if (hour >= 7 && hour < 10 && isMorning == true && isWeekend == false) {
		 fee = 2.95;
	  }
	  //Split this fee into two since it changed from AM to PM
	  else if (hour >= 10 && hour < 13 && isMorning == true && isWeekend == false) { 
		  fee = 1.90;
	  }
	  else if (hour >= 1 && hour < 3 && isMorning == false && isWeekend == false) {
		  fee = 1.90;
	  }
	  else if (hour >= 3 && hour < 8 && isMorning == false && isWeekend == false) {
		  fee = 3.95;
	  }
	  else if (hour >= 8 && isMorning == false && isWeekend == false) {
		  fee = 1.40;
	  }
	  else if (hour < 7 && isMorning == true && isWeekend == true) {
		  fee = 1.05;
	  }
	  //Split this fee into two because it changed from AM to PM
	  else if (hour >= 7 && hour <= 13 && isMorning == true && isWeekend == true) {
		  fee = 2.15;
	  }
	  else if (hour >= 1 && hour < 8 && isMorning == false && isWeekend == true) {
		  fee = 2.15;
	  }
	  else if (hour >= 8 && isMorning == false && isWeekend == true) {
		  fee = 1.10;
	  }
	  return fee;
   }
  public static void main(String[] args) {
       Zylabs5CalcToll tollObj = new Zylabs5CalcToll();
       
       // Test for each if statement.
       /*System.out.println(tollObj.calcToll(6, true, false));
       System.out.println(tollObj.calcToll(7, true, false));
       System.out.println(tollObj.calcToll(10, true, false));
       System.out.println(tollObj.calcToll(1, false, false));
       System.out.println(tollObj.calcToll(3, false, false));
       System.out.println(tollObj.calcToll(8, false, false));
       System.out.println(tollObj.calcToll(6, true, true));
       System.out.println(tollObj.calcToll(7, true, true));
       System.out.println(tollObj.calcToll(1, false, true));
       System.out.println(tollObj.calcToll(8, false, true));
       */
       
       //Test the three samples from the specification.
       System.out.println(tollObj.calcToll(7, true, false));
       System.out.println(tollObj.calcToll(1, false, false));
       System.out.println(tollObj.calcToll(3, true, true));
       
   }
}

/* Weekday Tolls
Before 7:00 am ($1.15) All morning
7:00 am to 9:59 am ($2.95) All morning
10:00 am to 2:59 pm ($1.90) 1/2 morning, 1/2 evening
3:00 pm to 7:59 pm ($3.95) All evening
Starting 8:00 pm ($1.40) All evening

Weekend Tolls
Before 7:00 am ($1.05)
7:00 am to 7:59 pm ($2.15)
Starting 8:00 pm ($1.10)
*/