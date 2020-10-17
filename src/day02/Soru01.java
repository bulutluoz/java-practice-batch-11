package day02;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 * SORU 1 Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin ve vucut
		 * kutle endeksini bulun. 
		 * VKE’ni ondalikli sayi olarak yazdirin ve kullanicinin
		 * durumunu belirleyin.
		 * 
		 * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir 
		 * 
		 * VKE<20 ise kullanici zayif 
		 * 20<VKE<25 ise kullanici saglikli 
		 * 25<VKE<30 ise kullanici
		 * sisman 30<VKE ise kullanici obez
		 * 
		 * Ornek : Input : boy :180 kilo : 80 
		 * Output : Vucut kutle endeksiniz : 24.691… sagliklisiniz
		 * 
		 */
		
		// 1- boyu cm, kiloyu kg olarak al
		
		Scanner scan = new Scanner(System.in);
		System.out.println("boyunuzu giriniz (cm)");
		double boy = scan.nextDouble();
		System.out.println("kilonuzu giriniz (kg)");
		double kilo = scan.nextDouble();

		
		// 2- VKE yi hesapla, bunun icin boyu metreye cevir
		
		  boy /=100;
		  
		  double vke = kilo/(boy*boy);
		//System.out.println(vke); //24.691
		
		// 3- VKE yi sinirlarla karsilastir, durumu tespit et ve yazdir
		// Vucut kutle endeksiniz : 24.691… sagliklisiniz
		
		if(vke<20) {
			
			System.out.println("Vucut kutle endeksiniz : " + vke + ", zayifsiniz");
		} else if (vke>20 && vke<25) {
			System.out.println("Vucut kutle endeksiniz : " + vke + ", sagliklisiniz");
		} else if (vke>25 && vke<30) {
			System.out.println("Vucut kutle endeksiniz : " + vke + ", kilolusunuz");
		} else System.out.println("Vucut kutle endeksiniz : " + vke + ", obezsiniz");
		

		scan.close();
	}

}
