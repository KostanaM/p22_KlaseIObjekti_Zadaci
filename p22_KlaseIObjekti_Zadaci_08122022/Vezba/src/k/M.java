package k;
import static java.lang.Math.*;

import java.util.Arrays;
public class M {
	
	private double[][] matr;

	public M(int v, int k) {
		matr = new double [v][k] ;
	}

	public int postavi() {
		return matr;
	}

	public void setMatr(double[][] matr) {
		this.matr = matr;
	}

	@Override
	public String toString() {
		return "M [matr=" + Arrays.toString(matr) + "]";
	}
	
	
}
	
	
	

