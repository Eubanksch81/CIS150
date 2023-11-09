package CIS150Projects;
import java.util.Arrays;
public class Lab8Evens {
   
   public int[] removeEvens(int [] nums) {
	  int evensCount = 0;
	  for (int i = 0; i < nums.length; ++i) {
		   if (nums[i] % 2 == 0) { //if nums[i] is even
    		evensCount += 1;
    		//System.out.print(" " + evensCount);
    	 }
	  }
	  int[] noOddNums = new int[nums.length - evensCount];
	  //System.out.println(" " + noOddNums.length);
	  for (int i = 0; i < noOddNums.length; ++i) { // Goes 5 times
		  for (int j = 0; j < nums.length; ++j) { //changes noOddNums values to each respective nums[j] that is even
				if (nums[j] % 2 != 0) { //if nums[j] is odd
					noOddNums[i] = nums[j];
					//System.out.println(Arrays.toString(nums));
					nums[j] = 0; //makes nums[j] even so that it skips the number next iteration
					//System.out.println(Arrays.toString(nums));
					//System.out.println(Arrays.toString(noOddNums));
				}
				else {
					continue;
				}
			break; 
			} 
	  }  
	   return noOddNums;  
   }
  
   public static void main(String[] args) {
      Lab8Evens labObject = new Lab8Evens();
      int [] input = {1,2,3,4,5,6,7,8,9};
      int [] result = labObject.removeEvens(input);
      
      // Helper method Arrays.toString() converts int[] to a String
      System.out.println(Arrays.toString(result)); // Should print [1, 3, 5, 7, 9]
   }
}