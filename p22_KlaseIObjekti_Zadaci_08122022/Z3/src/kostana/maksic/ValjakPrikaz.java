package kostana.maksic;

public class ValjakPrikaz {

	public static void main(String[] args) {
		Valjak v1 = new Valjak();
		Valjak v2 = new Valjak(3, 5);

		System.out.println("V1: " + v1.V());
		System.out.println("V2: " + v2.V());

		Valjak p1 = new Valjak();
		Valjak p2 = new Valjak(3, 5);

		System.out.println("P1: " + p1.P());
		System.out.println("P2: " + p2.P());
	}

}
