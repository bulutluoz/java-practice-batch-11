package day01;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
		 * 
		 * Ornek : Inputs : Ali, topu, tut 
		 *         Output : Ali topu tut.
		 * 
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cumle halinde yazmak icin 1.kelimeyi yaziniz");
		String kelime1=scan.next();
		System.out.println("Cumle halinde yazmak icin 2.kelimeyi yaziniz");
		String kelime2=scan.next();
		System.out.println("Cumle halinde yazmak icin 3.kelimeyi yaziniz");
		String kelime3=scan.next();
		
		// Ali topu tut.
		
		System.out.println(kelime1 + " " + kelime2 + " " + kelime3+".");
		scan.close();
	}

}
