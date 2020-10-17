package day04;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
		 * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
		 * yaziniz
		 * 
		 * Array={3,5,21,32,34,45,56,57,76,87,95}
		 * 
		 * Input : 5  Output: Girdiginiz sayi Arrayde var 
		 * Input : 15 Output: Girdiginiz sayi Arrayde yok
		 * 
		 * 
		 */
		int array[]={3,5,21,32,34,45,56,57,76,87,95};
		
		kontrol(array);

	}
	
	public static void kontrol(int array[]) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Arrayde olup olmadigini kontrol etmek icin bir sayi giriniz");
		int sayi=scan.nextInt();
		int flag=15;
		
		for (int i = 0; i < array.length; i++) {
			
			if (sayi==array[i]) {
				System.out.println("Girdiginiz sayi arrayde var");
				flag++;
				break;
			}
		}  if (flag==15) {
			System.out.println("girdiginiz sayi arrayde yok");
		}

		scan.close();
	}

}
