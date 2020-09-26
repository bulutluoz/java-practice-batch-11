package day03;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 harften uzun bir kelime ve 10’dan kucuk bir sayi alin,
		 * Kelimenin son 2 harfini girilen sayi kadar yan yana yazdirin
		 * 
		 * ORNEK:
		 * 
		 * INPUT  : Kelime: Mustafa Sayi:3
		 * OUTPUT : fafafa
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String kelime = scan.next();
		System.out.println("10'dan kucuk bir tamsayi giriniz");
		int sayi = scan.nextInt();

		
		String son2Harf=kelime.substring(kelime.length()-2);
		
		for (int i = 1; i <=sayi; i++) {
			System.out.print(son2Harf);
			
		}
		
		scan.close();
	}

}
