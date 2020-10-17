package day06;

public class Soru04 {
	
	static String isim;
	static String soyisim;
	static String brans;
	static String tel;
	
	private static String okulIsmi="yildiz koleji";

	public static void main(String[] args) {
		/* Soru04 Class’i olusturun bu Class’da bir Ogretmen icin gerekli 
		 * bilgileri girebilecegim Instance Variable’lar olusturun 
		 * ve main method icinde bu variable’lara deger atayin ve yazdirin
		 * 
		 */
		
		isim="Ali";
		soyisim="Yilmaz";
		brans="Kimya";
		tel="5301234567";
		
		System.out.println(isim +", "+soyisim+", "+brans+", "+tel);
		

	}

	public static String getOkulIsmi() {
		return okulIsmi;
	}

}
