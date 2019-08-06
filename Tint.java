// Class
public class Tint {

	// Fields
	double x1, x2, y1, y2;
	int tint;

	// Constructor
	public Tint(int x1, int y1, int x2, int y2, int tint) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.tint = tint;
	}

	// helper to see if coordinate is within bounds of object
	public boolean within(double x, double y) {
		boolean flag = false;

		if (x > this.x1 && x < this.x2 && y > this.y1 && y < this.y2)
			flag = true;

		return flag;
	}

	// Accessor
	public int getTint() {
		return this.tint;
	}
}
