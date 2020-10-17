package day06;

import java.util.Arrays;

public class Soru07 {

	public static void main(String[] args) {
		/*
		 * - Bir array olusturun, icerisinde 5 tane int eleman olsun 
		 * - Array’in elamanlarini yazdirin 
		 * - Bir for loop olusturun, loop ile arrayin tum elemanlarini 2
		 * artirin ve yazdirin 
		 * - Loop’dan sonra Arrayi yeniden yazdirin
		 * 
		 * - Yeni bir loop olusturun, array’in tum elemanlarini loop ile degistirip 
		 * sonra tum arrayi yazdirin 
		 * - Loop’dan sonra Arrayi yeniden yazdirin
		 * 
		 * -elemanlari kalici olarak loop ile degistirin
		 */
		
		int [] arr = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(arr));
		
		for (int w : arr) {
			System.out.print(w+2+" ");
		}

		System.out.println(" ");
		System.out.println(Arrays.toString(arr));

		for( int i = 0; i<arr.length; i++) {
			arr[i] +=2;
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
	}

}
