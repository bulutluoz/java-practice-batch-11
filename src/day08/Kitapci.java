package day08;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Kitapci {
	
	static int no=1000;
	static String kitapAdi;
	static String yazarAdi;
	static int yayinYili;
	static int fiyat;
	static HashMap<Integer, String> kitapListe = new HashMap<>();
	

	public static void main(String[] args) {
		/*
		 * Bir kitapci icin program yapalim
		 * 
		 * Kitap no 1000'den baslayarak sirali no olsun Her kitap icin kitapAdi,
		 * yazarAdi,yayinYili,fiyati bilgilerini girelim
		 * 
		 * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
		 * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
		 * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6- Bitir
		 */
		topluKitapEkle();
		menu();

	}

	private static void topluKitapEkle() {
		kitapListe.put(9999, "ali can evde, ali han, 2001, 11");
		kitapListe.put(9998, "ali can yolda, ali han, 2005, 10");
		kitapListe.put(9997, "yanlizlik, Veli Kul, 2005, 21");
		kitapListe.put(9996, "Sen, Ayse Unal, 2005, 30");	
		
	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tercihinizi giriniz \n1: Kitap ekle " + "\n2: Numara ile kitap goruntule"
				+ "\n3: Bilgi ile kitap goruntule" + "\n4: Numara ile kitap sil" + "\n5: Tum kitaplari listele"
				+ "\n6: Bitir");

		int tercih = scan.nextInt();

		switch (tercih) {
		case 1:
			kitapEkle();
			break;
		case 2:
			noIleKitapGoruntule();
			break;
		case 3:
			bilgiIleKitapGoruntule();
			break;
		case 4:
			noIleKitapSil();
			break;
		case 5:
			tumKitaplariListele();
			break;
		case 6:
			bitir();
			break;	
		default:
			System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyin");
			System.out.println("=================");
			menu();
		}

	}

	public static void tumKitaplariListele() {
		for (Entry<Integer, String> entry : kitapListe.entrySet()) 
		{    System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue()); }
		
		
		
		System.out.println("============================");
		menu();
		
		
		
		}
		


	public static void noIleKitapSil() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Silmek istediginiz kitabin numarasini giriniz");
		int number = scan.nextInt();
		kitapListe.remove(number);
		menu();
	}

	private static void bilgiIleKitapGoruntule() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Aradiginiz kitap hakkinda bir bilgi girin");
		String aramaBilgi=scan.nextLine();
		int flag=0;
		for (Entry<Integer, String> entry : kitapListe.entrySet()) {     
			if (entry.getValue().contains(aramaBilgi)) {
				System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue());
				flag++;
		}

	} if(flag==0) {
		System.out.println("aradiginiz kitap bulunamadi");}
	System.out.println("============================");
	menu();
		
	}

	private static void noIleKitapGoruntule() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Gormek istediginiz kitabin numarasini giriniz");
		int number = scan.nextInt();
	System.out.println(kitapListe.get(number));
		menu();
		
	}

	public static void kitapEkle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kitap adi giriniz");
		kitapAdi=scan.nextLine();
		System.out.println("Yazar adi giriniz");
		yazarAdi=scan.nextLine();
		System.out.println("Kitap yayin yilini giriniz");
		yayinYili=scan.nextInt();
		System.out.println("Kitap fiyatini giriniz");
		fiyat=scan.nextInt();
		
		String kitapBilgi= kitapAdi +", "+ yazarAdi+", "+yayinYili+", "+fiyat;
		kitapListe.put(no, kitapBilgi);
		System.out.println(no +" numara ile " + kitapBilgi + " eklendi");
		no++;
		menu();
	}

	public static void bitir() {
		System.out.println("Programi kullandiginiz icin tesekkurler");
		
	}

}
