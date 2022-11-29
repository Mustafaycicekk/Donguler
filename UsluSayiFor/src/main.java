import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int sayi1, sayi2, total = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Alttaki Sayı: ");
		sayi1 = sc.nextInt();
		
		System.out.print("Üstteki Sayı: ");
		sayi2 = sc.nextInt();
		
		
		for(int i = 1; i <= sayi2; i++) {
			total = total * sayi1;
		}
		System.out.println(total);
	}
}
