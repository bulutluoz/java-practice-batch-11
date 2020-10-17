package day02;

import java.util.Scanner;

public class Soru05 {
	public static void main(String[] args) {

		/*
		 * Kullanicidan uc basamakli bir sayi alin 
		 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
		 * 
		 * 
		 * Ornek : Inputs : 853 
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 *          Girdiginiz sayinin onlar basamagi : 5 
		 *          Girdiginiz sayinin yuzler basamagi : 8
		 * 
		 * 
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("3 basamaklý bir sayý giriniz" );
		int sayi =scan.nextInt();

		
		// 1) 1 ler basamagindaki sayiyi bulun
		 
		int birler= sayi%10;
		System.out.println("girdiginiz sayinin birler basamagi " + birler);
		sayi/=10;
		
		// 2) 10 lar basamagindaki sayiyi bulun
		
		int onlar= sayi%10;
		System.out.println("girdiginiz sayinin onlar basamagi " + onlar);
		
		// 3) 100 ler basamagindaki sayiyi bulun
		int yuzler=sayi/=10;
		System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);
		
		scan.close();
	}

}
