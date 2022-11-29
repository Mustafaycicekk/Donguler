import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int sayi = 0;
		int toplam = 0;
		boolean tekMi = true;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Bir Sayı Giriniz: ");
			sayi = sc.nextInt();
			if (sayi % 2 == 1) {
				tekMi = true;
				break;
			} else {
				if (sayi % 4 == 0 && sayi % 2 == 0) {
					toplam = toplam + sayi;
					//System.out.println("Bu Sayı Toplanıyor:" + " + " + sayi + " = " + toplam);
				} else {
					//System.out.println("Bu Sayı Toplanmıyor: " + sayi + " = " + toplam);
				}
			}

		} while (tekMi);
		//System.out.println("Tek Sayı Girdiğiniz için Döngü Bitti");
		System.out.println("Girdiğiniz Değerler Arasındaki Çift ve 4'ün Katı olan Sayıların Toplamı: " + toplam);
	}
}
