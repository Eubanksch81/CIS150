import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Sample {
   public static void main(String[] args) throws IOException {
      FileInputStream fstream = null; // file stream
      String idToFind;// Using string for id in case has both numbers and letters, like M47
      String dbId = "-1";
      String dbFirstName;
      String dbLastName;
   
      Scanner scnr = new Scanner(System.in);
      idToFind = scnr.nextLine();

      // You need not understand the file open and close functions to complete this program. Just know that 
      // fstream can be read just like System.in can be read in a new Scanner. 
      
      fstream = new FileInputStream("CustomerDb.txt");
      scnr = new Scanner(fstream);
      
      // File successfully opened, will throw exception otherwise
      
         // When reaching end of file, hasNext() will evaluate to false
         while (!(dbId.equals(idToFind)) && scnr.hasNext()) {  
             //Find 
         }
         
         // Finish this code
         
         fstream.close();
      }
}