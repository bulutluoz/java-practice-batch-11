package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile 
		 * 8. elemaninin yerlerini degistirin.
		 * 
		 * ORNEK:
		 * 
		 * INPUT : String[] isimler=
		 * {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet",
		 * "Ali"};
		 * 
		 * OUTPUT : String[] isimler=
		 * {"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal"
		 * ,"Ahmet","Ali"};
		 */

		
		
		String isimler[]= {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};	
		
		// once array olusturup sonra Arrays clasorunu kullanarak listeye cevirdigimizde ekleme,cikarma yapamiyoruz
		// yani array'in ozelliklerini gosteriyor
		List<String> list = Arrays.asList(isimler);
		
		System.out.println(list);
		//list.remove(2);
		
		// list ve array icin en cok for each loop kullaniyoruz
		
		List<String> list2=new ArrayList<>();
		System.out.println(list2);
		
		for (String w : isimler) {
			list2.add(w);
		}
        
        System.out.println(list2);
        
        String eleman3= list2.get(2);
        String eleman8=list2.get(7);
        
        System.out.println(list2);
        
        list2.remove(2);
        list2.remove(6);
        
        System.out.println(list2);
        
        list2.add(2, eleman8);
        list2.add(7, eleman3);
        
        System.out.println(list2);
		
		
		
		
		
		
		
	}

}
