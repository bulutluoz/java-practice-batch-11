package day06;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		/*
		 * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
		 * variable’lara atama yapin
		 * 
		 * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
		 * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
		 * yazdirsin
		 * 
		 * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
		 * sonrasinda yeniden ogrenci bilgilerini yazdirin
		 * 
		 * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
		 * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve 
		 * eski soyismi (Yani can'i) degistirsin.
		 */
		
		String isim="Ali";
		String soyisim="Can";
		String tel="5301234567";
		
		isimDegistir(isim,soyisim,tel);
		
		System.out.println(isim + ", "+soyisim + ", "+ tel);
		
		soyisim=soyisimDegistir(soyisim);
		
		System.out.println(isim + ", "+soyisim + ", "+ tel);
	}

	public static String soyisimDegistir(String soyisim) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yeni soyisminizi giriniz");
		String yeniSoyisim=scan.nextLine();
		
		return yeniSoyisim;
	}

	public static void isimDegistir(String isim, String soyisim, String tel) {
		isim="Mehmet";
		soyisim="Kan";
		tel="532123457";
		
		System.out.println(isim+", "+ soyisim+", "+ tel);
	}

}
