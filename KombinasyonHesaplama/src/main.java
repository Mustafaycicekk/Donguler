import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int deger1, deger2, fark, carpim, kombinasyon;
		int kume1 = 1, kume2 = 1, kume3 = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Birinci Değeri Giriniz: ");
		deger1 = sc.nextInt();

		for (int i = 1; i <= deger1; i++) {
			kume1 = kume1 * i;
		}

		System.out.println("İkinci Değeri Giriniz: ");
		deger2 = sc.nextInt();

		for (int i = 1; i <= deger2; i++) {
			kume2 = kume2 * i;
		}
		if (deger1 > deger2) {
			fark = deger1 - deger2;
			for (int i = 1; i <= fark; i++) {
				kume3 = kume3 * i;
			}
			carpim = kume2 * kume3;
			kombinasyon = kume1 / carpim;
			System.out.println("Kombinasyon: " + kombinasyon);
		} else {
			System.out.println("Küme 1, Küme 2'den Büyük Olmalıdır, Tekrar Denemelisin..");
		}

	}
}
