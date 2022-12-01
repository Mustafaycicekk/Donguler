import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Kaç Elemanlı Fibonacci Serisi İstiyorsunuz: ");
		int seri = sc.nextInt();
		int a = 0;
		int b = 1;
		int sonuc = 0;

		System.out.print(seri + " Elemanlı Fibonacci Serisi: ");
		System.out.print(a + " " + b + " ");
		for (int i = 0; i <= seri - 2; i++) {
			sonuc = a + b;
			a = b;
			b = sonuc;
			System.out.print(sonuc + " ");
		}
	}
}
