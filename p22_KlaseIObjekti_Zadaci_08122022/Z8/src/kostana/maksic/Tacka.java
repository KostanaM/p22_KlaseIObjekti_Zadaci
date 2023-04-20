package kostana.maksic;

public class Tacka {
	double x;
	double y;

	Tacka() {
	}

	Tacka(double x) {
		this.x = x;
	}

	public Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double poteg() {
		return Math.sqrt(x * x + y * y);
	}

	double Rastojanje(Tacka t) {
		return Math.sqrt(Math.pow(x - t.x, 2)+Math.pow(y - t.y, 2));
	}

}
