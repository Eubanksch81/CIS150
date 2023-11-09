import java.util.Scanner;

public class AcademicIndexScore {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double aisThreshold;
		double GPA;
		double testScore;
		
		aisThreshold = scnr.nextDouble();
		
		for (double i = 3.0; i < 4.1;) { //i being GPA
			//AIS = 2.5 * (GPA / 4.0) * 100 + (test_score / 1600) * 100.
			//If AIS is 270, then find the minimum amount of GPA (between 3.0 and 4.0) and test scores to get that AIS.
			
			testScore = -((2.5 * (i / 4.0) * 100 - aisThreshold) / 100) * 1600;
			System.out.printf("GPA: %.1f", i);
			System.out.print(" | ");
			System.out.printf("Test Score: %.1f", testScore);
			System.out.println("");
			i = i + .1;
		}
		
		
	}

}
