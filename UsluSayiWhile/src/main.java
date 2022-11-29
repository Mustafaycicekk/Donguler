import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		int sayi1, sayi2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Üssü Alınacak Sayı: ");
		sayi1 = scan.nextInt();
		
		System.out.print("Üs Olacak Sayı: ");
		sayi2 = scan.nextInt();
		
		int i = 1;
		int toplam = 1;
		
		while(i <= sayi2) {
			toplam *= sayi1;
			i++;
		}
		System.out.println("Cevap: " + toplam);
		
	}
}
