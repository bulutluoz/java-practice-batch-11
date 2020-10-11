package day05;

public class Soru04 {

	public static void main(String[] args) {
		/*
		 * Parametre olarak kac integer girilirse girilsin, 
		 * toplamlarini veren bir method yaziniz
		 * 
		 * 
		 * Method ismi : toplama(?)
		 * 
		 * INPUT : toplama(2,3) OUTPUT : 5 
		 * INPUT : toplama(2,3,4) OUTPUT : 9 
		 * INPUT : toplama(2,3,4,5) OUTPUT : 14
		 */
		
		System.out.println(toplama(4,7,15)); //vararg
		

	}

	private static int toplama(int... i) {
		int toplam=0;
		
		for (int w : i) {
			toplam+=w;
		}
		return toplam;
	}

}
