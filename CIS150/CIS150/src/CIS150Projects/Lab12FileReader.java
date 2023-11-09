package CIS150Projects;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Lab12FileReader {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      FileInputStream fileByteStream = null; //Allows for reading and writing files
      Scanner inFS = null;
      String[] foodName = new String[10];
      String[] foodCategory = new String[10];
      String[] foodDescription = new String[10];
      String[] foodAvailability = new String[10]; //Character array, leading to 10 character strings
      int i = 0;
      
      String fileName = scnr.next(); //Gets name of file
      fileByteStream = new FileInputStream(fileName); //has to be food.txt
      inFS = new Scanner(fileByteStream); //Allows scanner to read file
      
      while (inFS.hasNext() && i < foodName.length) { //Reads each line of the file and updates arrays accordingly
    	//Order of file is in: Category, Name, Description, Availability
    	  String dataLine = inFS.nextLine();
    	  //System.out.println(dataLine);
    	  
    	  //Increments foodCategory
    	  for (int k = 0; k < dataLine.length(); ++k) {
    		  if (dataLine.charAt(k) == ' ') {
    			  if (dataLine.charAt(k + 1) == ' ') { //If double space
    				  foodCategory[i] = dataLine.substring(0, k); //increments foodCategory between start and double space
    				  dataLine = dataLine.substring(k, dataLine.length()); //Removes foodCategory from line
    				  for (int m = 0; m < dataLine.length(); ++m) {
    					  if (dataLine.charAt(m) != ' ') { //Removes starting spaces for next array
    						  dataLine = dataLine.substring(m, dataLine.length());
    						  break; //Breaks to stop from removing the entire string
    					  }
    				  }
    				  //System.out.println("Remaining string: " + dataLine);
    				  //System.out.println("Category: " + foodCategory[i]);
    				  break; //Breaks to stop from incrementing foodCategory more than once
    			  }
    		  }
    	  }
    	  
    	  //increments foodName
    	  for (int k = 0; k < dataLine.length(); ++k) {
    		  if (dataLine.charAt(k) == ' ') { //If space detected
    			  if (dataLine.charAt(k + 1) == ' ') { //If double space
    				  foodName[i] = dataLine.substring(0, k); //increments foodName between start and double space
    				  dataLine = dataLine.substring(k, dataLine.length()); //Removes foodName from line
    				  for (int m = 0; m < dataLine.length(); ++m) {
    					  if (dataLine.charAt(m) != ' ') { //Removes starting spaces for next array
    						  dataLine = dataLine.substring(m, dataLine.length());
    						  break; //Breaks to stop from removing the entire string
    					  }
    				  }
    				  //System.out.println("Remaining string: " + dataLine);
    				  //System.out.println("Name: " + foodName[i]);
    				  break; //Breaks to stop from incrementing foodName more than once
    			  }
    		  }
    	  }
    	  //increments foodDescription
    	  for (int k = 0; k < dataLine.length(); ++k) {
    		  if (dataLine.charAt(k) == ' ') { //If space detected
    			  if (dataLine.charAt(k + 1) == ' ') { //If double space
    				  foodDescription[i] = dataLine.substring(0, k); //increments foodDescription between start and double space
    				  dataLine = dataLine.substring(k, dataLine.length()); //Removes foodDescription from line
    				  for (int m = 0; m < dataLine.length(); ++m) {
    					  if (dataLine.charAt(m) != ' ') { //Removes starting spaces for next array
    						  dataLine = dataLine.substring(m, dataLine.length());
    						  break; //Breaks to stop from removing the entire string
    					  }
    				  }
    				  //System.out.println("Remaining string: " + dataLine);
    				  //System.out.println("Description: " + foodDescription[i]);
    				  break; //Breaks to stop from incrementing foodDescription more than once
    			  }
    		  }
    	  }
    	  //Increments food Availability
    	  foodAvailability[i] = dataLine; //Last part of string, so no spaces afterwards.
    	  //System.out.println("Availability: " + foodAvailability[i]);
    	  
    	  ++i;
      }
      
      for (int j = 0; j < foodAvailability.length; ++j) {
    	  if (foodAvailability[j].equals("Available")) { //If the food is available
    		  System.out.print(foodName[j] + " ");
    		  System.out.print("(" + foodCategory[j] + ") -- ");
    		  System.out.println(foodDescription[j]);
    	  }
      }
      
      inFS.close();
      fileByteStream.close(); //Closes file.
   }
}
