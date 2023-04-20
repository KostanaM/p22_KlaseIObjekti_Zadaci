package kostana.maksic;

public class TackaIspis {

	public static void main(String[] args) {
		Tacka t1 = new Tacka(); // 0,0
		Tacka t2 = new Tacka(5);
		Tacka t3 = new Tacka(2, 2);

		System.out.println("Rastojanje od kordinatnog početka tačke t1: " + t1.poteg());
		System.out.println("Rastojanje od kordinatnog početka tačke t2: " + t2.poteg());
		System.out.println("Rastojanje od kordinatnog početka tačke t3: " + t3.poteg());

		
		System.out.println("Rastojanje tačke t1 od tačke t2: " + t1.Rastojanje(t2));
		System.out.println("Rastojanje tačke t2 od tačke t2: " + t2.Rastojanje(t3));
		System.out.println("Rastojanje tačke t3 od tačke t2: " + t3.Rastojanje(t1));
	}

}
