import java.util.Random;

public class GetDotCoords {

	public static void main(String[] args) {
		int xCoord;
		int yCoord;
		int coordNum = 7; //Number of Coordinates wanted
		Random randGen = new Random();
		
		for (int i = 0; i < coordNum; ++i) {
		xCoord = randGen.nextInt(11) + 1;
		yCoord = randGen.nextInt(6) + 1;
		
		System.out.println("(" + xCoord + ", " + yCoord + ")");
		}

	}

}
