package day02;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		/*
		 * SORU 8
		 * 
		 * Kullanicidan 3 basamakli bir sayi alip sayinin okunusunu yazdirin
		 * 
		 * Input : 356 
		 * Output : Ucyuzellialti
		 * 
		 * 
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("3 basamaklý bir sayý giriniz" );
		int sayi =scan.nextInt();

		
		// 1) 1 ler basamagindaki sayiyi bulun
		 
		int birler= sayi%10;
		System.out.println("girdiginiz sayinin birler basamagi " + birler);
		sayi/=10;
		
		// 2) 10 lar basamagindaki sayiyi bulun
		
		int onlar= sayi%10;
		System.out.println("girdiginiz sayinin onlar basamagi " + onlar);
		
		// 3) 100 ler basamagindaki sayiyi bulun
		int yuzler=sayi/=10;
		System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);
		
		switch (yuzler) {
		case 1:
			System.out.print("yüz");
			break;
		case 2:
			System.out.print("ikiyüz");
			break;
		case 3:
			System.out.print("üçyüz");
			break;
		case 4:
			System.out.print("dörtyüz");
			break;
		case 5:
			System.out.print("beþyüz");
			break;
		case 6:
			System.out.print("altýyüz");
			break;
		case 7:
			System.out.print("yediyüz");
			break;
		case 8:
			System.out.print("sekizyüz");
			break;
		case 9:
			System.out.print("dokuzyüz");
			break;

		}
		switch (onlar) {
		case 1:
			System.out.print("on");
			break;
		case 2:
			System.out.print("yirmi");
			break;
		case 3:
			System.out.print("otuz");
			break;
		case 4:
			System.out.print("kýrk");
			break;
		case 5:
			System.out.print("elli");
			break;
		case 6:
			System.out.print("altmýþ");
			break;
		case 7:
			System.out.print("yetmiþ");
			break;
		case 8:
			System.out.print("seksen");
			break;
		case 9:
			System.out.print("doksan");
			break;
			default:
				System.out.print("");
		

	}
		switch (birler) {
		case 1:
			System.out.println("bir");
			break;
		case 2:
			System.out.println("iki");
			break;
		case 3:
			System.out.println("üç");
			break;
		case 4:
			System.out.println("dört");
			break;
		case 5:
			System.out.println("beþ");
			break;
		case 6:
			System.out.println("altý");
			break;
		case 7:
			System.out.println("yedi");
			break;
		case 8:
			System.out.println("sekiz");
			break;
		case 9:
			System.out.println("dokuz");
			break;
			default:
				System.out.println(" ");
				break;
		}
		scan.close();
	}
}

