import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç Basamaklı Olsun: ");
		int n = scan.nextInt();

		for (int i = n - 1; i >= 1; i--) {
			for (int k = 1; k <= (n - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
