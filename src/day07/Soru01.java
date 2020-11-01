package day07;

import java.io.FileInputStream;
import java.util.Scanner;


public class Soru01 {
	
	static int oyuncu=1;
	static int puan1=0;
	static int puan2=0;
	static String kelime="";
	static String ekleme="";

	public static void main(String[] args) {
		
		/* Iki kisinin oynayacagi bir kelime oyunu uretelim
		 * Kurallar
		 * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
		 * 
		 * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
		 *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
		 *        ve 3.adima gecin 
		 *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun 
		 *        kazandigini yazip oyunu bitirin
		 *        
		 * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
		 *      * devam etmek isterse kelimeye eklemek istedigi string'i ve 
		 *          basa mi sona mi ekleyecegini sorun
		 *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
		 *          
		 *      *   Devam etmek istemezse 
		 *          "Oyun bitti" yazin
		 *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin  
		 */
		

		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		System.out.println(oyuncu +". oyuncu lutfen kelime giriniz");
		kelime=scan.next();
		
		
		// oyuncuyu degistirmek icin bir method yazalim
		oyuncuDegistir();
		
		onaySor();

}

	public static void onaySor() {
		System.out.println("Girilen kelime : " + kelime);
		System.out.println(oyuncu+". oyuncu girilen kelimeyi kabul ediyor musun ? \n1 : Evet 2:Hayir");
		Scanner scan=new Scanner(System.in);
		int karar=scan.nextInt();
		if (karar==1) {   // bu girilen kelimeyi kabul ediyor demektir
			if (oyuncu==1) {
				puan2+=kelime.length();
			} else puan1+=kelime.length();
			devamIstiyormu();
			
		} else oyunuBitir(); // girilen kelimeyi kabul etmiyor
		
	}

	private static void devamIstiyormu() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Oyuna devam etmek istiyor musunuz "
				+ "\n 6:devam 7:bitir");
		int tercih=scan.nextInt();
		if (tercih==6) {
			stringEkle();
		} else {
			System.out.println("Oyun bitti");
			System.out.println("1.oyuncu puan : " + puan1);
			System.out.println("2.oyuncu puan : " + puan2);
			if (puan1>puan2) {
				System.out.println("1.oyuncu kazandi");
			} else if (puan2>puan1) {
				System.out.println("2.oyuncu kazandi");
			} else System.out.println("oyun berabere");
			
		}
		
	}

	public static void stringEkle() {
		Scanner scan=new Scanner(System.in);
		System.out.println("eski kelimeye eklemek icin bir string yazin");
		ekleme=scan.next();
		System.out.println("basa mi sona mi eklemek istersiniz "
				+ "\n 4:basa 5:sona ekle");
		int tercih=scan.nextInt();
		if (tercih==4) {
			kelime=ekleme+kelime;
		} else kelime =kelime+ekleme;
		oyuncuDegistir();
		onaySor();
		
	}

	private static void oyunuBitir() {
		System.out.println(oyuncu + ". oyuncu oyunu kazandi. Cunku diger oyuncu yanlis kelime girdi");
		
	}

	public static void oyuncuDegistir() {
		if (oyuncu==1)
			oyuncu=2;
		else
			oyuncu=1;
		
	}
}
