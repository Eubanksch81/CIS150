package CIS150Projects;
import java.util.Scanner;

public class Zylabs4PartOne {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      long phoneNumber;
      long firstThree;
      long middleThree;
      long endFour;

      phoneNumber = scnr.nextLong();
      
      firstThree = phoneNumber / 10000000;
      //System.out.println(firstThree);
      
      middleThree = (phoneNumber / 10000) % 1000;
     //System.out.println(middleThree);
      
      endFour = phoneNumber % 10000;
      //System.out.println(endFour);
      
      System.out.println("(" + firstThree + ") " + middleThree + "-" + endFour);
      
   }
}
