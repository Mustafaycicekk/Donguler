import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// 3 ve 4'e Tam Bölünen Sayıların Ortalamasini Hesaplama

		int sayi, toplam = 0, ortalama = 0, sayac = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayıyı Giriniz: ");
		sayi = sc.nextInt();

		for (int i = 1; i <= sayi; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				toplam = toplam + i;
				sayac = sayac + 1;
				ortalama = toplam / sayac;
			}
		}
		System.out.println("Şartı Sağlayan Sayıların Toplamı: " + toplam);
		System.out.println("Sayıların Ortalamasi: " + ortalama);

	}
}
