package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru01 {

	public static void main(String[] args) {
		List<String> list2 = new ArrayList<>();
		list2.add("ALI");
		list2.add("veli");
		list2.add("Ayse");
		list2.add("fatma");
		System.out.println(list2);
		
		
		// Listenin tamamini for-each loop ile buyuk harf yapalim
		
//		for (String w : list2) {
//			w=w.toUpperCase(locale)
//		}
//		
//		System.out.println("for-each loop'tan sonra : " + list2);
		
		// for-each loop ile listenin tum elemanlarini kalici olarak degistiremedik
		
		// for loop ile listenin tum elemanlarini buyuk harf yapalim
		
		for (int i = 0; i < list2.size(); i++) {
			list2.set(i, list2.get(i).toUpperCase());
		}
		System.out.println("for loop sonrasi : " + list2);
		
		// iterator ile listenin elamanlarini kalici olarak kucuk harf ile degistirelim
		
		ListIterator<String> itr = list2.listIterator();
		
		while(itr.hasNext()) {
			
			String gecici =itr.next();
			itr.set(gecici.toLowerCase());
		}
		System.out.println("iterator sonrasi : " + list2);
		
	}

}
