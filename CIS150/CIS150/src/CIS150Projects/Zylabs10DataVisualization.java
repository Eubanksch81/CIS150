package CIS150Projects;
import java.util.Scanner;
import java.util.ArrayList;

public class Zylabs10DataVisualization {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String dataTitle;
		String columnOneHeader;
		String columnTwoHeader;
		String stringInput = "";
		Integer integerData;
		int i = 0;
		ArrayList<String> stringDataList = new ArrayList<String>();
		ArrayList<Integer> integerDataList = new ArrayList<Integer>();
		
		System.out.println("Enter a title for the data:");
		dataTitle = scnr.nextLine();
		System.out.println("You entered: " + dataTitle);
		
		System.out.println("\nEnter the column 1 header:");
		columnOneHeader = scnr.nextLine();
		System.out.println("You entered: " + columnOneHeader);
		
		System.out.println("\nEnter the column 2 header:");
		columnTwoHeader = scnr.nextLine();
		System.out.println("You entered: " + columnTwoHeader + "\n");
		
		System.out.println("Enter a data point (-1 to stop input):");
		stringInput = scnr.nextLine();
		
		while (!stringInput.equals("-1")) {
			boolean noError = false;
			while (noError == false) {
				int commaAmount = 0;
				boolean hasComma = false;
				for (int j = 0; j < stringInput.length(); ++j) {
					if (stringInput.charAt(j) == ',') { //Searches for commas, makes sure there is only one.
						hasComma = true;
						commaAmount += 1;
					}
				}
				if (hasComma == false) {
					System.out.println("Error: No comma in string.");
					System.out.println("\nEnter a data point (-1 to stop input):");
					stringInput = scnr.nextLine();
				}
				if (commaAmount > 1) {
					System.out.println("Error: Too many commas in input.");
					System.out.println("\nEnter a data point (-1 to stop input):");
					stringInput = scnr.nextLine();
				}
				if (!Character.isDigit(stringInput.charAt(stringInput.length() - 1))) {
					System.out.println("Error: Comma not followed by an integer.");
					System.out.println("\nEnter a data point (-1 to stop input):");
					stringInput = scnr.nextLine();
				}
				if (hasComma == true && commaAmount < 2 && Character.isDigit(stringInput.charAt(stringInput.length() - 1))) { //No errors
					noError = true;
				}
			}
			String integerInput = stringInput.substring(stringInput.indexOf(',') + 1, stringInput.length());
			integerData = Integer.parseInt(integerInput);
			stringInput = stringInput.substring(0, stringInput.indexOf(','));
			stringDataList.add(stringInput);
			System.out.println("Data string: " + stringDataList.get(i));
			integerDataList.add(integerData);
			System.out.println("Data integer: " + integerDataList.get(i) + "\n");
			
			System.out.println("Enter a data point (-1 to stop input):");
			stringInput = scnr.nextLine();
			++i;
		}
		System.out.println("");
		System.out.printf("%34s", dataTitle + "\n");
		System.out.printf("%-20s|%23s\n", columnOneHeader, columnTwoHeader);
		//System.out.printf("%-20s | ", columnOneHeader);
		//System.out.printf("%23s", columnTwoHeader);		
		System.out.println("--------------------------------------------");
		
		for (int k = 0; k < stringDataList.size(); ++k) {
			System.out.printf("%-20s|%23s\n", stringDataList.get(k), integerDataList.get(k));
		}
		
		System.out.println("");
		
		for (int m = 0; m < stringDataList.size(); ++m) {
			System.out.printf("%21s", stringDataList.get(m) + " ");
			for (int n = 0; n < integerDataList.get(m); ++n) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
