package day02;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan iki tamsayi sayi ve islem cinsini alin 
		 * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
		 * 
		 * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
		 * 
		 * Ornek : Inputs : sayilar : 18 , 10  islem : 3
		 *         Output : 18 X 10 = 180
		 * 
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki tam sayi giriniz");
		int s1=scan.nextInt();
		int s2=scan.nextInt();
		
		System.out.println("Bir Islem ismi giriniz : \n1:toplama \n2:cikarma \n3:carpma \n4:bolme");
		int islem=scan.nextInt();
		
		
		switch(islem) {
		
		case 1:
			System.out.println(s1 +" + " +  s2  + " = " + (s1+s2));
			break;
			
		case 2:
			System.out.println(s1 +" - " +  s2  + " = " + (s1-s2));
			break;
		case 3:
			
			System.out.println(s1 +" x " +  s2  + " = " + (s1*s2));
			break;
		case 4:
			System.out.println(s1 +" / " +  s2  + " = " + (s1/s2));
			break;
		default:
			System.out.println("Lutfen gecerli bir islem seciniz");
		
		}
		
		scan.close();

	}

}
