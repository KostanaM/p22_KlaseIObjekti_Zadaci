package k;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		M m1=new M();
	M m2=new M(2,2);

	System.out.println(m1.rastojanje());
	System.out.println(m2.rastojanje());
	
	System.out.println(m1.rastojanje2(m2));
	System.out.println(m2.rastojanje2(m1));
	}

}
