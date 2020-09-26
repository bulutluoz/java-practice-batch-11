package day03;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		/*
		 * Bir sayýnýn mükemmel olup olmadýðýný bulan bir program yazýnýz.
		 * 
		 * 
		 * Mükemmel sayý : bir sayýnýn kendisi hariç bölenlerinin toplamý, kendisine
		 * eþitse o sayý mükemmeldir.
		 * 
		 * ORNEK:
		 * 
		 * INPUT : 6
		 * 
		 * OUTPUT : 1,2,3 1+2+3 = 6 = 6 (Mükemmel)
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int number=scan.nextInt();
		
		int bolenlerinToplami=0;
		int i=1;
		
		do {
			if (number%i==0) {
				bolenlerinToplami+=i;
			}
			i++;
		}
		
		while(i<number);
		

		if (bolenlerinToplami==number) {
			System.out.println(number + " mukemmel sayi");
		} else {
			System.out.println(number + " mukemmel sayi degil");
		}
		scan.close();
	}

}
