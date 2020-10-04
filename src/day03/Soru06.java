package day03;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		/* Kullanicidan sayilar girmesini isteyin
		 * ve girdigi sayilari toplayip yazdirin
		 * ve yeni sayi isteyin
		 * 
		 * girilen sayilarin toplami 100 'u gecerse
		 * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
		 * 
		 */
		
		
		int toplam=0;
		int count=0;
		Scanner scan=new Scanner(System.in);
		do {

			System.out.println("Bir sayi giriniz");
			int sayi= scan.nextInt();
			
			toplam+=sayi;
			
			System.out.println("Simdiye kadar girilen sayilari toplami = " + toplam);
			count++;
		}
		while(toplam<100);
		
		System.out.println(count + " kere sayi girdin. Bu kadar sayi yeter.");
		
		scan.close();
	}

}
