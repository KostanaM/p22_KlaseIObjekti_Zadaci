package kostana.maksic;

public class Circle {

	private double radius;

	Circle(/* lista parametara */) { // konstruktor bez parametara
		radius = 0.0;
	}

	Circle(double radius) { // ima jedan parametar
		this.radius = radius;
	}

	Circle(Circle ob) { // imaobjekat kao parametar
		radius = ob.radius; // postupak inicijalizacije polja ( atributa) objekta klase
	}

	public double area() {
		return 3.14 * radius * radius;
	}
}
