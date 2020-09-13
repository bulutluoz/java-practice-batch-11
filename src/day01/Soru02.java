package day01;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir character girmesini isteyin ve 
		 * girilen karakteri ve ascii degerini yazin
		 * 
		 * Ornek : Input  : a 
		 *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ascii degerini gormek icin bir karakter yaziniz");
		
		char input = scan.next().charAt(0);
		
	
		int asciiValue = input;
		
		System.out.println("Girdiginiz  `"+input+"` karekterinin ascii degeri: "+ asciiValue);
		scan.close();
	}

}
