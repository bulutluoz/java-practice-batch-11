package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soru01 {
	public static void main(String[] args) {
		/*
		 * SORU 1) Bes elemanli bir String list olusturup asagidaki islemleri yapin
		 * 
		 * Isimler : {Jim,Jack,Tom,Lee,Pam}
		 * 
		 * -) Jim yerine Lucy ekleyiniz. 
		 * -) 3. index’e Temel’e ekleyiniz. 
		 * -) Jack i listeden siliniz. 
		 * -) Gregor 'u listeye ekleyiniz. 
		 * -) List’in buyuklugunu bulunuz.
		 * -) Alfabetik siraya koyunuz, 
		 * -) List’in elemanlarinin tamamini siliniz.
		 */
		
		// 2 yolla list olusturabiliriz
		 
		List<String> list = new ArrayList<>();
		list.add("Jim");
		list.add("Jack");
		list.add("Tom");
		list.add("Lee");
		list.add("Pam");
		System.out.println(list);
		
		// array olusturup sonradan liste cevirebiliriz
		String arr[]={"Jim","Jack","Tom","Lee","Pam"};
		List<String> list2=Arrays.asList(arr);
		
		System.out.println(list2);
		
		//Jim yerine Lucy ekleyiniz. 
		
		list.remove("Jim");
		System.out.println(list);
		list.add(0, "Lucy");
		System.out.println(list);
		//3. index’e Temel’e ekleyiniz.
		list.add(2, "Temel");
		System.out.println(list);
		
		//Gregor 'u listeye ekleyiniz.
		list.add("Gregor");
		System.out.println(list);
		//Alfabetik siraya koyunuz, 
		
		Collections.sort(list);
		System.out.println(list);
		//List’in buyuklugunu bulunuz.
		System.out.println(list.size());
		
		//List’in elemanlarinin tamamini siliniz.
		list.removeAll(list);
		System.out.println(list);

	}

}
