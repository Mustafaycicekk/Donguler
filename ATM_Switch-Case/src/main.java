import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kullaniciAdi, sifre;

		int bakiye = 1000;
		int tercih;
		int hak = 3;

		while (hak > 0) {

			System.out.print("Kullanici Adınızı Giriniz: ");
			kullaniciAdi = sc.nextLine();
			System.out.print("Şifrenizi Giriniz: ");
			sifre = sc.nextLine();

			if (kullaniciAdi.equals("musti") && sifre.equals("asd123")) {
				System.out.println("AYC Bankasına Hoşgeldiniz :)");
				do {
					System.out.println("Yapmak İstediğiniz İşlemi Seçiniz: ");
					System.out.println("Para Yatıma(1) Para Çekme(2) Bakiye Sorgulama(3) Çıkış(4)");
					tercih = sc.nextInt();
					switch (tercih) {
					case 1: {
						System.out.println("Para Miktarı: ");
						int para = sc.nextInt();
						bakiye = bakiye + para;
						break;
					}
					case 2: {
						System.out.println("Para Miktarı: ");
						int para = sc.nextInt();
						if (para > bakiye) {
							System.out.println("Hesabınızda Bu Miktarda Para Bulunmamaktadır");
						} else {
							bakiye = bakiye - para;
						}
						break;
					}
					case 3: {
						System.out.println("Bakiyeniz: " + bakiye);
						break;
					}
					}
				} while (tercih != 4);
				System.out.println("Tekrar Görüşmek Üzere");
				break;
			} else {
				hak--;
				if (hak == 0) {
					System.out.println("Kartınız Bloke Edilmiştir.");
				} else {
					System.out.println("Kullanici Adı veya Şifreniz Yanlış. Tekrar Deneyiniz. ");
					System.out.println("Kalan Hakkınız: " + hak);
				}

			}

		}
	}
}