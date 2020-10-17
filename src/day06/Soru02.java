package day06;

import java.util.Scanner;

public class Soru02 {
	
	static String isim="Ali";

	public static void main(String[] args) {
		/*
		 * Kullanicidan ay olarak 1 ile 12 arasindaki bir sayiyi alan, 
		 * sayiyi ay isimleri olarak yazdiran bir method olusturun
		 * 
		 * INPUT : 11 OUTPUT: Kasim 
		 * INPUT :  5 OUTPUT: Mayis 
		 * INPUT : 15 OUTPUT: Lutfen 1 ile 12 arasinda bir numara girin
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz.");
		int i = scan.nextInt();
		
		ayBul(i);
	}

	public static void ayBul(int i) {
	
        String ay;
        	switch (i) {
        
        
            case 1:  
            	System.out.println("Ocak");
                break;
            case 2: 
            	System.out.println("SUBAT");
                break;
            case 3:  System.out.println("MART");
            break;
            case 4:  System.out.println("Nisan");
            break;
            case 5: System.out.println("mayis");
            break;
            case 6: System.out.println("haziran");
            break;
            case 7:  System.out.println("temmuz");
            break;
            case 8: System.out.println("agustos");
            break;
            case 9: System.out.println("eylul");
            break;
            case 10:System.out.println("ekim");
            break;
            case 11: System.out.println("kasim");
            break;
            case 12:System.out.println("aralik");
            break;
            default: System.out.println("Lutfen 1 ile 12 arasinda bir numara girin");
            
        }
        
    }
		
	}


