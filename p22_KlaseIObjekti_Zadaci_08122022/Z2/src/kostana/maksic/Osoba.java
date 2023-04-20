package kostana.maksic;

//2. Podatke o osobi čine ime, datum rođenja i adresa stanovanja. Omogućiti unošenje podataka o osobi
//čitanjem sa glavnog ulaza i sastavljanje tekstualnog opisa. Kreirati UML diagram za zadatu klasu.
public class Osoba {

	String ime;
	String datumRodjenja;
	String adresaStanovanja;

//nismo navodili konstruktor i zato je kompajler pozvao defultni konstruktor
	public String Ispisi() {
		return "Ime: " + ime + "\n" + "Datum rodjenja: " + datumRodjenja + "\n" + "Adresa: " + adresaStanovanja + "\n";
	}

}
