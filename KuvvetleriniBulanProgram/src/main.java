import java.util.Iterator;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz:");
		n = scan.nextInt();

		for (int i = 1; i <= n; i *= 4) {
			System.out.println("4'ün Kuvvetleri: " + i);
		}
		System.out.println("--------------------------");
		for (int i = 1; i <= n; i *= 5) {
			System.out.println("5'in Kuvvetleri: " + i);
		}

	}
}
