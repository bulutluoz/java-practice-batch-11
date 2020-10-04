package day03;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 10’dan kucuk bir sayi alin ve carpim tablosu olusturun ORNEK:
		 * INPUT : number: 4 OUTPUT : 1 2 3 4 
		 *                            2 4 6 8 
		 *                            3 6 9 12 
		 *                            4 8 12 16
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int number=scan.nextInt();
		
		
		
		for (int j = 1; j <= number; j++) {
			
			for (int i = 1; i <= number; i++) {
				
				System.out.print(i*j + " ");
				
			} System.out.println();
		}
		scan.close();
		
	}

}
