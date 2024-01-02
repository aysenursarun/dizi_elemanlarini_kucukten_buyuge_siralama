package dizi_elemanlarini_kucukten_buyuge_siralama;

import java.util.Arrays;
import java.util.Scanner;

public class dizi_elemanlarini_kucukten_buyuge_siralama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dizinin boyutu n : ");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Dizinin elemanlarını giriniz : ");
		
		for (int i =0; i<n; i++) {
				System.out.print(i + 1 + ". Elemanı : ");
			    arr [i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("Sıralama : " + Arrays.toString(arr));
	}

}
