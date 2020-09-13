package day01;

import java.util.Scanner;

public class Soru06 {
	public static void main(String[] args) {
		/*
		 * Kullaniciya gunde kac cay ictigini ve kac seker kullandigini sorun. 
		 * Bir yilda kac kg seker kullandigini hesaplayip yazdirin 
		 * 
		 * 1 seker = 1.7 gr
		 * 
		 * 
		 * Ornek : Input : cay sayisi : 10 seker sayisi :2 
		 *         Output : Yilda 12.41 kg seker kullaniyorsunuz
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" gunde kac cay icersiniz ");
		int caySayisi = scan.nextInt();
		System.out.println(" caya kac seker atarsiniz ");
		int sekerSayisi = scan.nextInt();
		
		
		
		double sekerTuketimi = 365*caySayisi * sekerSayisi * 1.7/1000 ;
		
		//Yilda 12.41 kg seker kullaniyorsunuz
		System.out.println("Yilda " +sekerTuketimi+ "  kg seker kullaniyorsunuz");

		scan.close();
	}

}
