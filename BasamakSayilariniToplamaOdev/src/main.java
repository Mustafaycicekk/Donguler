import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int sayi, b, result = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Sayı Giriniz: ");
		sayi = scan.nextInt();

		while (sayi != 0) {
			b = sayi % 10;
			result += b;
			sayi = sayi / 10;
		}
		System.out.println("Sonuç: " + result);
	}
}
