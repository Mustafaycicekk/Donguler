import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sayac = 1, adet, sayi;
		System.out.print("Kaç Tane Sayı Gireceksiniz: ");
		adet = sc.nextInt();
		
		int min = 0, max = 0;
		while (sayac <= adet) {
			if (sayac == 1) {
				System.out.print(sayac + ". Sayıyı Giriniz: ");
				sayi = sc.nextInt();
				min = sayi;
				max = sayi;
			} else {
				System.out.println(sayac + ". Sayıyı Giriniz: ");
				sayi = sc.nextInt();
				if (sayi < min) {
					min = sayi;
				} else if(sayi > max){
					max = sayi;
				}
			}

			sayac++;
		}
		System.out.println("En Küçük Sayı: " + min);
		System.out.println("En Büyük Sayı: " + max);

	}
}
