package day05;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir cumle alin. 
		 * 
		 * Kullanicidan alinan cumleyi Parametre olarak kabul edip, 
		 * Array kullanarak cumlenin tersini ceviren 
		 * ve sonucu bir String olarak main method’a donduren bir Method yazin.
		 * 
		 * Not : Buyuk,kucuk harf,bosluklar ve ozel karakterler degistirilmeyecek
		 * 
		 * 
		 * Input : Kod yazmak cok guzel. 
		 * Output : .lezug koc kamzay doK
		 */
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Tersini Cevirmek Icin Bir Cumle giriniz");
		String str = scan.nextLine();
		

		
		System.out.println(terseCevir(str));

	}

	public static String terseCevir(String str) {
		
		String tersCumle="";
		String[] cumleArray=str.split("");
		
		for (int i = cumleArray.length-1; i >=0 ; i--) {
			tersCumle+=cumleArray[i];
		}
		
		return tersCumle;
	}



}
