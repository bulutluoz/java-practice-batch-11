package day03;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir cumle ve bir harf alin,
		 * Cumlede harfin kac kere
		 * kullanildigini bulup, yazdirin
		 * 
		 * ORNEK:
		 * 
		 * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
		 * 
		 * OUTPUT : Girdiginiz cumlede ‘e’ harfi 3 kere kullanilmis.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle = scan.nextLine();
		System.out.println("bir harf giriniz");
		String harf = scan.next().substring(0, 1);
		
		int count=0;
		
		for (int i = 0; i < cumle.length(); i++) {
			
			if (cumle.substring(i, i+1).equals(harf)) {
				count++;
			}
		}
		
		System.out.println("Girdiginiz cumlede '"+ harf+ "' harfi " + count + " kere kullanilmis.");
		
		scan.close();
	}

}
