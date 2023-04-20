package kostana.maksic;

public class CirclePovrsina {

	public static void main(String[] args) {

		Circle c1 = new Circle(10); // konstruktor sa parametrom
		Circle c2 = new Circle(c1); // pozivamo objekat kao parametar
		Circle c3 = new Circle();

		System.out.println("Povrsina kruga iznosi : " + c1.area());
		System.out.println("Povrsina kruga iznosi : " + c2.area());
		System.out.println("Povrsina kruga iznosi : " + c3.area());
	}

}
