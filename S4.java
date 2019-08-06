// Zak Timson
// Uses Tint.java (Object)

/* I didn't finish this program because I got stuck up on the first program trying to fix a bug so I ran out of time.
My thinking behind this problem was making an object for each stain glass piece so I could send the object a
location and have it return true or false. and from that I could run that each coordinate through two for loops of
the largest x and y and determine whether each point was the right tint level. This is as far as I got but after that
I was planning on using this data to make a graph similar to the example given and from that I could make the program
realise that point (1,2) and (2,2) are part of the same area. This program does have an error so it doesn't run from what
I gather because I ran it for the first time just as the competition ended.
*/

// Libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// Class
public class S4 {

	// Main method
	public static void main(String[] args) throws FileNotFoundException {
	
		// Load dummy data
		final String dir = new File(" ").getAbsolutePath().trim();
		FileReader fr = new FileReader(dir + "S4.txt");
		Scanner scan = new Scanner(fr);

		// Load number of pieces
		int pcs = scan.nextInt();
		// Load what shade of tint we are looking for
		int lookFor = scan.nextInt();
		int counter = 0; // keep track of matches

		// create an array of the pieces of tint glass using my Tint object
		Tint[] tint = new Tint[pcs];

		// Loop for each piece of tinted glass
		for (int i = 0; i < tint.length; i++) {
			String temp = scan.nextLine(); // Get the next line of coordinates
			String[] stats = temp.split(" "); // Split the coordinates
			// Create a new Tint object with the coordinates
			tint[i] = new Tint(Integer.parseInt(stats[0]),
					Integer.parseInt(stats[1]), Integer.parseInt(stats[2]),
					Integer.parseInt(stats[3]), Integer.parseInt(stats[4]));
		}
		
		// Loop through coordinates
		for (int x = 0; x < 1000000000; x++){ // X coordinate
			int totalTint = 0; // Reset the total tint on this coordinate
			for (int y = 0; y < 1000000000; y++){ // Y coordinate
				// Test to see if each piece of glass to see if coordinate is present in its area
				for (int i = 0; i < tint.length; i++){
					// if it is get the tint and add it to the total tint of that coordinate
					if (tint[i].within(x, y) == true){
						totalTint+=tint[i].getTint();
					}
					// If the total tint is = to what is being looked for
					if (totalTint == lookFor){
						counter++;
					}
				}
			}
		}
		System.out.println(counter); // Output the number of tinted spots
	}
}
