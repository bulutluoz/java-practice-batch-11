package day02;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		/*
		 * SORU 4
		 * 
		 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, 
		 * kullaniciya musteri karti olup olmadigini sorun 
		 * 
		 * Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
		 * Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Urun miktarini giriniz");
		int miktar = scan.nextInt();
		System.out.println("Urun liste fiyatini giriniz");
		double price = scan.nextDouble();
		System.out.println("Musteri kartiniz var mi 1:Evet  2:Hayir");
		int kart=scan.nextInt();
		
		
		
		//1.yol
		/*
		if(kart==1 && miktar>10) {
			System.out.println("%20 Indirimli toplam fiyat = " + miktar*price*.80 );
		} else if (kart==1 && miktar<10) {
			System.out.println("%15 Indirimli toplam fiyat = " + miktar*price*.85 );
		} else if (kart==2 && miktar>10) {
			System.out.println("%15 Indirimli toplam fiyat = " + miktar*price*.85 );
		} else if (kart==2 && miktar<10) {
			System.out.println("%15 Indirimli toplam fiyat = " + miktar*price*.90 );
		} else System.out.println("Lutfen size soylenen seceneklerden birini giriniz");
		
		*/
		
		// 2.yol
		
		if(kart==1) {
			if(miktar>10) {
				System.out.println("%20 Indirimli toplam fiyat = " + miktar*price*.80 );
			} else {
				System.out.println("%15 Indirimli toplam fiyat = " + miktar*price*.85 );
			}
					
		} else if(kart==2) {
			if(miktar>10 ) {
				System.out.println("%15 Indirimli toplam fiyat = " + miktar*price*.85 );
			}else {
				System.out.println("%15 Indirimli toplam fiyat = " + miktar*price*.90 );
			}
			
		} else System.out.println("Lutfen size soylenen seceneklerden birini giriniz");
		
		scan.close();
	}

}
