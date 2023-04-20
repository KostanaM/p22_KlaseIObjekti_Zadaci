package kostana.maksic;

//2. Podatke o osobi čine ime, datum rođenja i adresa stanovanja. Omogućiti unošenje podataka o osobi
//čitanjem sa glavnog ulaza i sastavljanje tekstualnog opisa. Kreirati UML diagram za zadatu klasu.
import java.util.Scanner;

public class OsobaIspis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Osoba o1 = new Osoba();

		System.out.println("Unesite ime: ");
		o1.ime = sc.nextLine();

		System.out.println("Unesite datum rodjenja: ");
		o1.datumRodjenja = sc.nextLine();

		System.out.println("Unesite adresu stanovanja: ");
		o1.adresaStanovanja = sc.nextLine();

		System.out.println(o1.Ispisi());

		sc.close();
	}

}