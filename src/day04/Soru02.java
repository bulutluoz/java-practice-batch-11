package day04;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 * SORU 2) Kullanicidan toplamak istedigi sayilari isteyen, girilen sayilarin
		 * adedini ve toplamini yazdiran bir method olusturun
		 * 
		 * Not: kullanici 0 sayisini girerse toplama islemini bitirip sonucu yazdirin
		 * 
		 * INPUT : 23, -2, 54, 12, -86, 0 
		 * OUTPUT : Girdiginiz 5 adet sayinin toplamlari =1
		 * 
		 * 
		 */
		
		
		toplama();

		
	} //main method sonu
	
	public static void toplama() {
		int sayi=0;
		int toplam=0;
		int count=0;
		// bir islemi belirli bir sart saglanana kadar tekrar edeceksek do-while loop kullaniriz
		
		
		do {
    		@SuppressWarnings("resource")
			Scanner scan= new Scanner(System.in);
            System.out.println("toplamak istediginiz sayýlarý giriniz \nBitirmek icin 0 seciniz");
            sayi =scan.nextInt();
            
            toplam+=sayi;
            count++;
		} while(sayi!=0);
		
   
		//Girdiginiz 5 adet sayinin toplamlari =1
		
		System.out.println("Girdiginiz " + (count-1) + " adet sayinin toplami = "+ toplam);
        
	}
	

} // class sonu
