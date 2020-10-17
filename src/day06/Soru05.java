package day06;

public class Soru05 {

	public static void main(String[] args) {
		/*
		 * - Soru05 Class’i olusturun burada Soru04 Clasindan 
		 * object ureterek yeni
		 * ogretmenler olusturun ve bilgilerini yazdirin
		 */
		
		
		Soru04 obj= new Soru04();
		obj.isim="hasan";
		obj.soyisim="Gun";
		obj.brans="fizik";
		obj.tel="5421234567";
		System.out.println(obj.isim +", "+obj.soyisim+", "+obj.brans+", "+obj.tel);


		Soru04 obj1= new Soru04();
		obj1.isim="ayse";
		obj1.soyisim="Gunduz";
		obj1.brans="tarih";
		obj1.tel="5421234568";
		System.out.println(obj1.isim +", "+obj1.soyisim+", "+obj1.brans+", "+obj1.tel);
		
		System.out.println(Soru04.getOkulIsmi());
		

	}

}
