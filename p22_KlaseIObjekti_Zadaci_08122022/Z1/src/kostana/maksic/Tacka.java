package kostana.maksic;

public class Tacka {
//1. Tačka u ravni se zadaje pomoću realnih koordinata, mogu da joj se dohvate vrednosti koordinata i može
	// da se konvertuje u tip String. Kreirati UML diagram za zadatu klasu.
	private double x;
	private double y;

	// konstruktor
	Tacka(double xx, double yy) {
		x = xx;
		y = yy;
	}

	// geter (uzima tj. dohvata) vrednot za kordinatu x.
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String Ispisi() {
		return "(" + x + " , " + y + ")";
	}

}