import java.util.Scanner;

public class mainWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Birinci Sayı: ");
		int s1 = sc.nextInt();

		System.out.print("İkinci Sayı: ");
		int s2 = sc.nextInt();

		int ebob = 1, ekok = 1, i = 1, k = 1;
		if (s1 >= s2) {
			System.out.println("İkinci Sayı Büyük Olmalı");
		} else {

			while (i <= s1) {
				if (s1 % i == 0 && s2 % i == 0) {
					ebob = i;
				}
				i++;
			}
			System.out.println("EBOB: " + ebob);

			while (k <= s1 * s2) {
				if (k % s1 == 0 && k % s2 == 0) {
					ekok = k;
					break;
				}
				k++;
			}
			System.out.println("EKOK: " + ekok);
		}

	}
}
