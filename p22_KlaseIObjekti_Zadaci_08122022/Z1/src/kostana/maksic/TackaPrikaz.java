package kostana.maksic;

public class TackaPrikaz {
//1. Tačka u ravni se zadaje pomoću realnih koordinata, mogu da joj se dohvate vrednosti koordinata i može
//	da se konvertuje u tip String. Kreirati UML diagram za zadatu klasu.
	public static void main(String[] args) {

		Tacka t1 = new Tacka(2, 5);
		Tacka t2 = new Tacka(3, 6);

		System.out.println(t1.getX());
		System.out.println(t1.getY());
		System.out.println(t1.Ispisi());

	}

}
