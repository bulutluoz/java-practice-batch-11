package day04;

public class HMC {

	public static void main(String[] args) {
		/*
		 * HMC(Hesap makinasi calistir) isimli bir class olusturun 
		 * HM classindan object olusturarak oradaki methodlari kullanin
		 */
		
		HM hesapMakinasi = new HM();
	
		// method olustururken maksadiniz sadece bir sey yazdirmak ise return type i void secip 
		//method icinde yazdirma islemini yaptirabilirsiniz
		hesapMakinasi.carp3(2, 3, 5);
		
		// method olusturuken sonucu farkli bir sekilde kullanmak istiyorsaniz return type'i 
		// ona gore secip sonucu kendinize dondurebilirsiniz
		
		
		System.out.println(hesapMakinasi.carp2(5, 7)+5);
		
		
		hesapMakinasi.topla3(9, 15, 78);
		int sayi= hesapMakinasi.topla2(9, 15)+5;

		System.out.println(sayi);
		
	}

}
