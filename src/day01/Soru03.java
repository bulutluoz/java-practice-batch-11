package day01;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 * SORU 3
		 * 
		 * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin 
		 * ve vucut kutle endeksini bulun. 
		 * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
		 * 
		 * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
		 * 
		 * Ornek : Input : boy :180 kilo : 80 
		 *         Output : Vucut kutle endeksiniz : 24 
		 *                  Vucut kutle endeksiniz : 24.691…
		 * 
		 * 
		 */

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen Boyunuzu cm olarak giriniz ");
		double boy = scan.nextDouble();
		
		
		System.out.println("Lutfen kilonuzu KG olarak giriniz ");
		double kilo = scan.nextDouble();
		
		
		// boyu cm olarak aldik ama metreye cevirmemiz gerekiyor
		
		boy/=100;  // boy=boy/100  boy++ , boy+=5 
		
		
		double vke = kilo/(boy*boy);
		
		System.out.println("Vucut kutle endeksiniz : " + vke);
		
		scan.close();
	}

}
