package src;// Zak Timson

// Libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//Class
public class S2 {

	// Main method
	public static void main(String[] args) throws FileNotFoundException {

		// Load in dummy data from file
		final String dir = new File(" ").getAbsolutePath().trim();
		FileReader fr = new FileReader(dir + "S2.txt");
		Scanner scan = new Scanner(fr);

		// Get the number of names (never used this information)
		String n = scan.nextLine();

		// Get the names from file and split the line into an array by white space
		String names1 = scan.nextLine();
		String[] nameSet1 = names1.split(" ");

		// Same as above for second set of names.
		String names2 = scan.nextLine();
		String[] nameSet2 = names2.split(" ");

		// Flags
		boolean flag = true;
		int counter = 0;

		try {
			while (flag) {
				// Compare names index by index
				if (nameSet1[counter].equals(nameSet2[counter])) {
					flag = false; // if two of the same names are found
					// Stop the program because it failed
				}
				counter++;
				// Counter to keep track of index
				// As soon as counter > nameSet1.length it will create an
				// Index out of bounds error (This allows the flag to stay true)
			}
		}catch(Exception e){}

		// Based on whether the program errors out or switches the flag a verdict
		// can be found
		if (flag) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}
	}
}
