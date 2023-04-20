package kostana.maksic;

public class RadnikPrikaz {

	public static void main(String[] args) {

		Radnik r1 = new Radnik("Pera", 100, 150000);

		Radnik r2 = new Radnik("Mika", 80, 120000);

		System.out.println("Prihod prvog radnika: " + r1.Revenue());
		System.out.println("Prihod drugog radnika: " + r2.Revenue());
		System.out.println(r1.Opis());
		r2.Opis2();

	}

}
