package kostana.maksic;

public class Radnik {

	String ime;
	double Revenue;
	double p;

	Radnik(String ime, double p, double Revenue) {
		this.ime = ime;
		this.Revenue = Revenue;
		this.p = p;
	}

	public double Revenue() {
		return Revenue;
	}

	public double plata() {
		return Revenue() * p / 100;
	}

	public String Opis() {
		return ime + "/" + plata();
	}

	public void Opis2() {
		System.out.println(ime + "/" + plata());
	}

}
