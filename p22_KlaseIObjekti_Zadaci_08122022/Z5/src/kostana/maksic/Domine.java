package kostana.maksic;

public class Domine {

	private int a;
	private int b;

	Domine(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public Domine okreni() {// novo
		int p = a;
		a = b;
		b = p;
		return this;
	}

	public boolean provera(Domine d) {
		return a == d.a && b == d.b || b == d.a && a == d.b;
	}

	public String opis() {
		return "(" + a + " , " + b + ")";
	}
}
