package kostana.maksic;

import java.util.Scanner;

public class AposolutnaVrednostPrikaz {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Unesite broj: ");
		int n=sc.nextInt();
		
		ApsolutnaVrednost b= new ApsolutnaVrednost(n);
		
		System.out.println("Apsolutna vrednost unetog broja je: " + b.Broj());
		
		
		sc.close();

	}

}

	