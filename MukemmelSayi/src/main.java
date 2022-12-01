import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz: ");
		int sayi = sc.nextInt();

		int toplam = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;
			}
		}
		if (toplam == sayi) {
			System.out.println("Mükemmel Sayıdır");
		} else {
			System.out.println("Mükemmel Sayı Değildir");
		}

	}
}
