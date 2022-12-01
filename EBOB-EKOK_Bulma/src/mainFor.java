import java.util.Scanner;

public class mainFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------EBOB Bulma Yöntemleri-------------");
		int n1, n2;
		int ebob = 1;
		System.out.println("n1 Sayısını Giriniz: ");
		n1 = sc.nextInt();

		System.out.println("n2 Sayısını Giriniz: ");
		n2 = sc.nextInt();

		// 1.Islem EBOB Bulurken 1 den Basladıgı icin fazla Doner Maliyetlidir;
		System.out.println("Yöntem 1");
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				System.out.println(i);
				ebob = i;
			}
		}
		System.out.println(ebob);
		System.out.println("---------------");

		// 2.Islem EBOB bulurken girilen en buyuk Sayidan Dongu Basladıgı için
		// Az Doner Maliyet daha dusuktur;
		System.out.println("Yöntem 2");
		for (int k = n1; k >= 1; k--) {
			if (n1 % k == 0 && n2 % k == 0) {
				ebob = k;
				System.out.println(k);
				System.out.println(ebob);
				break;
			}
		}

		System.out.println("------------------EKOK Bulma Yöntemleri-------------");

		int s1, s2;
		System.out.println("s1 Sayısını Giriniz: ");
		s1 = sc.nextInt();

		System.out.println("s2 Sayısını Giriniz: ");
		s2 = sc.nextInt();
		System.out.println("Yöntem 1");
		for (int i = 1; i <= (s1 * s2); i++) {
			if (i % s1 == 0 && i % s2 == 0) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("-------------");
		System.out.println("Yöntem 2");
		System.out.println((s1 * s2) / ebob);
	}
}
