package kostana.maksic;

public class DominePrikaz {

	public static void main(String[] args) {

		Domine d1 = new Domine(2, 4);
		Domine d2 = new Domine(3, 4);

		System.out.println(d1.provera(d2));

		System.out.println(d1.opis());
		d1.okreni();
		System.out.println(d1.opis());
		System.out.println(d2.opis());
		d2.okreni();
		System.out.println(d2.opis());

	}

}
