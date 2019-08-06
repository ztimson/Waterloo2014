// Zak Timson

// Libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

// Class
public class S3 {

	// Main method
	public static void main(String[] args) throws FileNotFoundException {
	
		// Load dummy data
		final String dir = new File(" ").getAbsolutePath().trim();
		FileReader fr = new FileReader(dir + "S3.txt");
		Scanner scan = new Scanner(fr);

		// Get number of tests
		int tests = scan.nextInt();

		// Create 2D array to hold all of the information
		int[][] cars = new int[tests][];

		for (int i = 0; i < tests; i++) {
			int num = scan.nextInt(); // get number of cars in test
			cars[i] = new int[num]; // initiate
			// Load cars into array
			for (int x = 0; x < num; x++) {
				cars[i][x] = scan.nextInt();
			}
		}

		// Loop until every test is complete
		for (int i = 0; i < cars.length; i++) {

			// Create two dynamic arrays for the train track and branch track by the lake
			ArrayList train = new ArrayList();
			ArrayList branch = new ArrayList();

			// Add all the cars to the track
			for (int x = (cars[i].length-1); x >= 0; x--) {
				train.add(cars[i][x]);
			}

			boolean flag = true;
			int counter = 1; // If there is only one train left it can be completed so offset of 1 is needed to make if's bellow work
			// Not error checking for consecutive numbers ex. 1, 2, 5, 3. car 4 is missed.

			// Loop until flag changes
			while (flag) {
				// If first car on track is required car
				if (Integer.parseInt(train.get(0).toString()) == counter){
					counter++; // Update what car is next required
					train.remove(0); // remove that car from first position on track
				} else { // Else move first car onto branch
					branch.add(0, train.get(0).toString());
					train.remove(0);
				}
				// Check fist car on branch to see if it is the required car
				if (Integer.parseInt(branch.get(0).toString()) == counter){
					counter++; // Update counter
					branch.remove(0); // Remove it
				}
				// If there is only 1 car left it is a success
				if (counter == cars[i].length){
					flag = false; // Make loop stop
					System.out.println("Y"); // Output result
				// If there is nothing left on the main track and the first car on the branch track is
				// not the required car the test is a failure
				} else if (train.size() == 0 && Integer.parseInt(branch.get(0).toString()) != counter){
					flag = false; // Stop loop
					System.out.println("N"); // Output result
				}
			}
		}
	}
}
