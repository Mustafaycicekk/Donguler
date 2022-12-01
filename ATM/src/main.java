import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userName, password;
		int sayac = 3;
		int bakiye = 3400;
		int secim;
		while (sayac > 0) {

			System.out.print("Kullanici Adınız: ");
			userName = sc.nextLine();

			System.out.print("Kullanici Şifreniz: ");
			password = sc.nextLine();

			if (userName.equals("musti") && password.equals("123")) {
				System.out.println("Merhaba, AYC Bankasına Hoşgeldiniz!");
				do {
					System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış Yap");
					System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
					
					secim = sc.nextInt();
					if (secim == 1) {
						System.out.println("Para Miktarı: ");
						int para = sc.nextInt();
						bakiye += para;
					} else if (secim == 2) {
						System.out.println("Para Miktarı: ");
						int para = sc.nextInt();
						if (para > bakiye) {
							System.out.println("Bakiye Yetersiz");
						} else {
							bakiye -= para;
						}
					} else if (secim == 3) {
						System.out.println("Bakiyeniz: " + bakiye);
					}

				} while (secim != 4);
					System.out.println("Tekrar Görüşmek Üzere.");
				break;
			} else {
				sayac--;
				System.out.println("Hatalı Kullanici Adı veya Şifre");
				if (sayac == 0) {
					System.out.println("Hesabınız Bloke Olmuştur.");
				} else {
					System.out.println("Kalan Hakkınız: " + sayac);
				}

			}

		}

	}
}
