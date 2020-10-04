package day04;

public class HM {

	/*
	 * HM(Hesap makinasi) isimli bir class olusturun 
	 * Icine 2 sayiyi carpan , 2 sayiyi toplayan ve sonucunu donduren 2 method 
	 * 3 sayiyi carpan, 3 sayiyi toplayan ve sonucu yazdiran 2 method olusturun
	 * 
	 * 
	 */
	
	
	public int topla2(int sayi1, int sayi2) {
		
		return sayi1+sayi2;
	}
	
	public int carp2(int sayi3, int sayi4) {
		
		return sayi3*sayi4;
	}
	
	public void topla3(int sayi1,int sayi2,int sayi3) {
		System.out.println("girdiginiz uc sayinin toplami = " + (sayi1+sayi2+sayi3));
	}
	
	public void carp3(int sayi1,int sayi2,int sayi3) {
		System.out.println("girdiginiz uc sayinin carpimi = " + (sayi1*sayi2*sayi3));
	}

}
