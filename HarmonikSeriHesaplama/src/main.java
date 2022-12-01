import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		int n;
		double sonuc = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.print("N Sayısını Giriniz: ");
		n = scan.nextInt();
		
		for(double i = 1; i <= n; i++) {
			sonuc += (1/i);
		}
		System.out.println(sonuc);
	}
}
