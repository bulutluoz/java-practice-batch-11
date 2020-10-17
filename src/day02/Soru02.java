package day02;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 * Kullaniciya gunde kac cay ictigini ve kac seker kullandigini sorun. 
		 * Bir yilda kac kg seker kullandigini hesaplayip yazdirin 
		 * 
		 * 1 seker = 1.7 gr 
		 * 
		 * Eger kullanici seker kullanmiyorsa (seker sayisi=0) “Cok guzel sifir seker saglikli yasam ”
		 * yazdirin
		 * 
		 * 
		 * Ornek : Input : cay sayisi : 10 seker sayisi :2 
		 *        Output : Yilda 12.41 kg seker kullaniyorsunuz
		 * 
		 * 		   Input : cay sayisi : 10 seker sayisi :0 
		 *        Output : Cok guzel sifir seker saglikli yasam 
		 * 
		 */
		
		
		// 1) cay ve seker sayisini al
		Scanner scan = new Scanner(System.in);
		System.out.println("Gunde kac cay iciyorsunuz? ");
		int cay = scan.nextInt();
		
		System.out.println("Caya kac seker atiyorsunuz? ");
		double seker = scan.nextDouble();
		double yilda = cay*seker*365*(1.7/1000);

		
		
		
		// 2) seker sayisi 0 ise direk sonuc yazdir, 
		//    0 degilse seker kullanimini bul ve yazdir
		// Yilda 12.41 kg seker kullaniyorsunuz
		
		
		if(seker==0) {
			System.out.println("Cok guzel sifir seker saglikli yasam");
		} else { System.out.println("Yilda " + yilda + " kg seker tuketiyorsunuz.");
		
		}
		
		scan.close();
	}

}
