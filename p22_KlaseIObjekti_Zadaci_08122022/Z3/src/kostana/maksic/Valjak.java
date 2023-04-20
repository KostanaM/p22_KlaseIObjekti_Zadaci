package kostana.maksic;

public class Valjak {

	private double r;
	private double h;

	Valjak(double rr, double hh) {
		r = rr;
		h = hh;
	}

	Valjak() {
		r = 1;
		h = 1;
	}

	public double getR() {
		return r;
	}

	public double getH() {
		return h;
	}

	public double V() {
		return r * r * 3.14 * h;
	}

	public double P() {
		return 2 * r * 3.14 * (r + h);
	}

	public String opis() { // moze public void ali onda ide System.out.println
		return "(" + r + ")" + " " + "(" + h + ")";
	}
}