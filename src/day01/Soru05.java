package day01;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		/*
		 * SORU 5
		 * 
		 * Kullaniciya gunde kac saat uyudugunu sorun, 
		 * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
		 * 
		 * Ornek : Input : 8 
		 *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
		 */
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Günlük uyku saatinizi giriniz..");
        int u = scan.nextInt();
        
        System.out.println("Ayda " + u*30/24 + ", yilda " + u*365/24 + ", 40 yilda " + u*365*40/24 + " gununuz uykuda geciyor..");
        scan.close();
	}
	}


