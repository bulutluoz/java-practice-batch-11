package day06;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir String alin, palindrome olup olmadigini 
		 * StringBuilder ile kontrol eden ve sonucu yazdiran 
		 * bir method olusturun 
		 * 
		 * ORNEK:
		 * 
		 * INPUT : HANNAH 
		 * OUTPUT : Girdiginiz cumle/kelime bir palindrome
		 * 
		 * 
		 */
		
		 Scanner scan = new Scanner(System.in);
      
         System.out.print("Palindrome oldugunu kontrol etmek icin kelime giriniz: ");
         String kelime = scan.nextLine();
         
         palindromeBul(kelime);

		

	}

	public static void palindromeBul(String kelime) {
		
		StringBuilder sb = new StringBuilder(kelime);
		
		if(sb.toString().equals(sb.reverse().toString())) {
			System.out.println("Girdiginiz kelime palindrom");
		}else {
			System.out.println("Girdiginiz kelime palindrom degil");
		}
		
	}

}
