package day03;

import java.util.Scanner;

public class Soru04 {
	public static void main(String[] args) {
		/*
		 * Kullanicidan email girmesini isteyin,
		 * 
		 * @ isareti icermiyorsa “gecerli bir email girin” yazdirin
		 * 
		 * @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
		 * 
		 * @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail
		 * hesabinizi girin” yazdirin
		 * 
		 * ORNEK:
		 * 
		 * INPUT : techproed.com OUTPUT : “gecerli bir email girin” 
		 * INPUT : techproed@gmail.com OUTPUT : “email onaylandi” 
		 * INPUT : techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin
		 * 
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Email adresinizi giriniz: ");
		String mail=scan.next();
		int no=mail.indexOf("@");
		
		if (!mail.contains("@")) {
			System.out.println("geçerli bir mail adresi girin");
		}else {
			
			if (mail.substring(no+1).equals("gmail.com")) {
				System.out.println("email onaylandý");
		
			}else {
				System.out.println("lütfen gmail hesabýnýzý girin");
			}


		scan.close();

	}}}

