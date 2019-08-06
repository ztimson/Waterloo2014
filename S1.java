// Zak Timson

// Libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

// Class
public class S1 {

	// Main method
	public static void main(String[] args) throws FileNotFoundException {

		// Because numbers will be removed each pass
		// A dynamic array might be nice
		ArrayList list = new ArrayList();

		// Import dummy data from S1.txt
		final String dir = new File(" ").getAbsolutePath().trim();
		FileReader fr = new FileReader(dir + "S1.txt");
		Scanner scan = new Scanner(fr);
		int k = scan.nextInt();

		// Fill array with required number of people
		for (int i = 0; i < k; i++) {
			list.add(String.valueOf(i + 1));
		}

		// Create an array for the different number of passes
		// that will be done
		int m = scan.nextInt();
		int[] remove = new int[m];
		for (int i = 0; i < m; i++) {
			remove[i] = scan.nextInt();
		}

		// Loop through each pass
		for (int i = 0; i < m; i++) {
			// Remember the size of the dynamic array during this pass
			int size = list.size();
			
			// Instead of looping through and testing each number in the array
			// some preliminary math can determine the exact number of passes
			// needed to increase the efficiency.
			for (int x = 0; x < size / remove[i]; x++) {
			
				/* This next part is where a quarter of the competition went well
				 * I over thought how to solve this bug. Because I am removing,
				 * lets say person 5 and 10, as soon as I remove person 5 person 10
				 * will no longer be in index number 9 but rather 8 as it is shrinking.
				 * After thinking about this for quite some time I decided best to move on
				 * and do problem number 2. After completing that one I cam back and instantly
				 * came up with the idea of filling that space with a String object == "".
				 */
				list.remove(((x + 1) * remove[i]) - 1);
				list.add((x + 1) * remove[i] - 1, "");
			}
			// Once every person that needed to be removed is switched for a ""
			// all objects == "" are removed getting rid of that bug.
			while (list.indexOf("") != -1) {
				list.remove(list.indexOf(""));
			}
		}

		// Output the remainder of the dynamic array
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
